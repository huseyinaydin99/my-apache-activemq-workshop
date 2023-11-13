<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ include file="/WEB-INF/jsp/taglibs.jsp" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title><tiles:insertAttribute name="title"/></title>

    <!-- Bootstrap CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="${pageContext.request.contextPath}/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="${pageContext.request.contextPath}/css/elegant-icons-style.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet"/>
    <!-- full calendar css-->
    <link href="${pageContext.request.contextPath}/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css"
          rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet"/>
    <!-- easy pie chart-->
    <link href="${pageContext.request.contextPath}/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css"
          rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.carousel.css" type="text/css">
    <link href="${pageContext.request.contextPath}/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/fullcalendar.css">
    <link href="${pageContext.request.contextPath}/css/widgets.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/style-responsive.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/xcharts.min.css" rel=" stylesheet">
    <link href="${pageContext.request.contextPath}/css/jquery-ui-1.10.4.min.css" rel="stylesheet">

    <!-- javascripts -->
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-ui-1.10.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="${pageContext.request.contextPath}/js/jquery.scrollTo.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- charts scripts -->
    <script src="${pageContext.request.contextPath}/assets/jquery-knob/js/jquery.knob.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="${pageContext.request.contextPath}/js/owl.carousel.js"></script>
    <!-- jQuery full calendar -->
    <script src="${pageContext.request.contextPath}/js/fullcalendar.min.js">
    </script> <!-- Full Google Calendar - Calendar -->
    <script src="${pageContext.request.contextPath}/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="${pageContext.request.contextPath}/js/calendar-custom.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="${pageContext.request.contextPath}/js/jquery.customSelect.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/chart-master/Chart.js"></script>

    <!--custome script for all page-->
    <script src="${pageContext.request.contextPath}/js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="${pageContext.request.contextPath}/js/sparkline-chart.js"></script>
    <script src="${pageContext.request.contextPath}/js/easy-pie-chart.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-jvectormap-world-mill-en.js"></script>
    <script src="${pageContext.request.contextPath}/js/xcharts.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.autosize.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.placeholder.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/gdp-data.js"></script>
    <script src="${pageContext.request.contextPath}/js/morris.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/sparklines.js"></script>
    <script src="${pageContext.request.contextPath}/js/charts.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.slimscroll.min.js"></script>
    <script>

        //knob
        $(function () {
            $(".knob").knob({
                'draw': function () {
                    $(this.i).val(this.cv + '%')
                }
            })
        });

        //carousel
        $(document).ready(function () {
            $("#owl-slider").owlCarousel({
                navigation: true,
                slideSpeed: 300,
                paginationSpeed: 400,
                singleItem: true

            });
        });

        //custom select box

        $(function () {
            $('select.styled').customSelect();
        });

        /* ---------- Map ---------- */
        $(function () {
            $('#map').vectorMap({
                map: 'world_mill_en',
                series: {
                    regions: [{
                        values: gdpData,
                        scale: ['#000', '#000'],
                        normalizeFunction: 'polynomial'
                    }]
                },
                backgroundColor: '#eef3f7',
                onLabelShow: function (e, el, code) {
                    el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
                }
            });
        });


    </script>


</head>

<body>
<!-- container section start -->
<section id="container" class="">


    <header class="header dark-bg">
        <div class="toggle-nav">
            <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i
                    class="icon_menu"></i></div>
        </div>

        <a href="index.html" class="logo">?leri Derece <span class="lite">Spring</span></a>

        <div class="top-nav notification-row">
            <!-- notificatoin dropdown start-->
            <ul class="nav pull-right top-menu">
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="${pageContext.request.contextPath}/img/UserIcon.png">
                            </span>
                        <span class="username">
                            <%= SecurityContextHolder.getContext().getAuthentication().getName() %>
                            </span>
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu extended logout">
                        <div class="log-arrow-up"></div>
                        <!-- <li class="eborder-top">
                            <a href="#"><i class="icon_profile"></i> Profilim</a>
                        </li>
                        <li>
                            <a href="#"><i class="icon_mail_alt"></i> Gelen Kutusu</a>
                        </li>
                        <li>
                            <a href="#"><i class="icon_clock_alt"></i> Zaman Çizelgesi</a>
                        </li>
                        <li>
                            <a href="#"><i class="icon_chat_alt"></i> Mesajla?malar</a>
                        </li>
                        <li>
                            <a href="login.html"><i class="icon_key_alt"></i> Ç?k?? Yap</a>
                        </li>
                        <li>
                            <a href="documentation.html"><i class="icon_key_alt"></i> Dökümanlar</a>
                        </li> -->
                        <li>
                            <a href="${pageContext.request.contextPath}/Logout"><i class="icon_key_alt"></i> Ç?k?? Yap</a>
                        </li>
                    </ul>
                </li>
                <!-- user login dropdown end -->
            </ul>
            <!-- notificatoin dropdown end-->
        </div>
    </header>
    <!--header end-->

    <!--sidebar start-->
    <aside>
        <div id="sidebar" class="nav-collapse ">
            <!-- sidebar menu start-->
            <ul class="sidebar-menu">
                <li class="active">
                    <a class="" href="${pageContext.request.contextPath}/Home">
                        <i class="icon_house_alt"></i>
                        <span>Yönetim Paneli</span>
                    </a>
                </li>

                <li>
                    <a class="" href="${pageContext.request.contextPath}/Products">
                        <i class="icon_genius"></i>
                        <span>Ürünler</span>
                    </a>
                </li>
            </ul>
            <!-- sidebar menu end-->
        </div>
    </aside>
    <!--sidebar end-->

    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <tiles:insertAttribute name="body"></tiles:insertAttribute>
        </section>
    </section>
    <!--main content end-->
</section>
<!-- container section start -->
</body>
</html>