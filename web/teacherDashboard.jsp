<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>


        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico"




              <link href="assets/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <link href="assets/css/dashboard.css" rel="stylesheet" type="text/css"/>

        <script src="assets/js/ie-emulation-modes-warning.js" type="text/javascript"></script>

        <script src="assets/js/ie10-viewport-bug-workaround.js" type="text/javascript"></script>

    </head>

    <body>

        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Report Management System</a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Welcome Teacher</a></li>
                        <li><a href="#">Logout</a></li>

                    </ul>
                    <form class="navbar-form navbar-right">
                        <input type="text" class="form-control" placeholder="Search...">
                    </form>
                </div>
            </div>
        </div>







        <div class="col-sm-3 col-md-2 sidebar"> <!--for side bar-->
            <ul class="nav nav-sidebar">
                <div class="panel-group" id="accordion">
                      
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseBIM">
                                    BIM
                                </a>
                            </h4>
                        </div>
                        <div id="collapseBIM" class="panel-collapse collapse">
                            <div class="panel-heading">
                                <div class="accordion-heading">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM1st">
                                        BIM1st
                                    </a>
                                </div>
                            </div>
                            <div class="panel-heading">
                                <div class="accordion-heading">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM1st">
                                        BIM2nd
                                    </a>
                                </div>
                            </div>
                            <div class="panel-heading">
                                <div class="accordion-heading">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM1st">
                                        BIM3rd
                                    </a>
                                </div>
                            </div>
                            <div class="panel-heading">
                                <div class="accordion-heading">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM1st">
                                        BIM4th
                                    </a>
                                </div>
                            </div>
                            <div class="panel-heading">
                                <div class="accordion-heading">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM1st">
                                        BIM5th
                                    </a>
                                </div>
                            </div>
                            <div class="panel-heading">
                                <div class="accordion-heading">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM1st">
                                        BIM6th
                                    </a>
                                </div>
                            </div>
                            <div class="panel-heading">
                                <div class="accordion-heading">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM1st">
                                        BIM7th
                                    </a>
                                </div>
                            </div>
                            <div class="panel-heading">
                                <div class="accordion-heading">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM1st">
                                        BIM8th
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                   
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseBBA">
                                    BBA
                                </a>
                            </h4>
                        </div>
                        <div id="collapseBBA" class="panel-collapse collapse">
                            <div class="panel-body">
                                <ul>
                                    <li>aaaa</li>
                                    <li>bbbb</li>
                                    <li>ccccc</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                 
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseBSCCSIT">
                                    BScCsit
                                </a>
                            </h4>
                        </div>
                        <div id="collapseBSCCSIT" class="panel-collapse collapse">
                            <div class="panel-body">
                                ccc
                            </div>
                        </div>
                    </div>
                </div>
            </ul>
        </div><!--for side bar-->








        <div id="table" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main"
             <h2 class="sub-header">High Speed Networking and communication</h2>
            <div class="table">
                <table class="table">

                    <tr>
                        <th>Name</th>
                        <th>assignment</th>
                        <th>Report</th>
                        <th>Mid-term</th>
                        <th>Presentation</th>
                        <th>Pre-Board</th>
                        <th>Total</th>
                    </tr>

                    <tbody>

                        <tr>
                            <td><input id="name1" type="text"></td>
                            <td><input id="ass1" type="text"></td>
                            <td><input id="report1" type="text"></td>
                            <td><input id="midterm1" type="text"></td>
                            <td><input id="presentation1" type="text"></td>
                            <td><input id="preboard1" type="text"></td>
                            <td><input id="Toatl1" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name2" type="text"></td>
                            <td><input id="ass2" type="text"></td>
                            <td><input id="report2" type="text"></td>
                            <td><input id="midterm2" type="text"></td>
                            <td><input id="presentation2" type="text"></td>
                            <td><input id="preboard2" type="text"></td>
                            <td><input id="Toatl2" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name3" type="text"></td>
                            <td><input id="ass3" type="text"></td>
                            <td><input id="report3" type="text"></td>
                            <td><input id="midterm3" type="text"></td>
                            <td><input id="presentation3" type="text"></td>
                            <td><input id="preboard3" type="text"></td>
                            <td><input id="Toatl3" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name4" type="text"></td>
                            <td><input id="ass4" type="text"></td>
                            <td><input id="report4" type="text"></td>
                            <td><input id="midterm4" type="text"></td>
                            <td><input id="presentation4" type="text"></td>
                            <td><input id="preboard4" type="text"></td>
                            <td><input id="Toatl4" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name5" type="text"></td>
                            <td><input id="ass5" type="text"></td>
                            <td><input id="report5" type="text"></td>
                            <td><input id="midterm5" type="text"></td>
                            <td><input id="presentation5" type="text"></td>
                            <td><input id="preboard5" type="text"></td>
                            <td><input id="Toatl5" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name6" type="text"></td>
                            <td><input id="ass6" type="text"></td>
                            <td><input id="report6" type="text"></td>
                            <td><input id="midterm6" type="text"></td>
                            <td><input id="presentation6" type="text"></td>
                            <td><input id="preboard6" type="text"></td>
                            <td><input id="Toatl6" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name7" type="text"></td>
                            <td><input id="ass7" type="text"></td>
                            <td><input id="report7" type="text"></td>
                            <td><input id="midterm7" type="text"></td>
                            <td><input id="presentation7" type="text"></td>
                            <td><input id="preboard7" type="text"></td>
                            <td><input id="Toatl7" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name8" type="text"></td>
                            <td><input id="ass8" type="text"></td>
                            <td><input id="report8" type="text"></td>
                            <td><input id="midterm8" type="text"></td>
                            <td><input id="presentation8" type="text"></td>
                            <td><input id="preboard8" type="text"></td>
                            <td><input id="Toatl8" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name9" type="text"></td>
                            <td><input id="ass9" type="text"></td>
                            <td><input id="report9" type="text"></td>
                            <td><input id="midterm9" type="text"></td>
                            <td><input id="presentation9" type="text"></td>
                            <td><input id="preboard9" type="text"></td>
                            <td><input id="Toatl9" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name10" type="text"></td>
                            <td><input id="ass10" type="text"></td>
                            <td><input id="report10" type="text"></td>
                            <td><input id="midterm10" type="text"></td>
                            <td><input id="presentation10" type="text"></td>
                            <td><input id="preboard10" type="text"></td>
                            <td><input id="Toatl10" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name11" type="text"></td>
                            <td><input id="ass11" type="text"></td>
                            <td><input id="report11" type="text"></td>
                            <td><input id="midterm11" type="text"></td>
                            <td><input id="presentation11" type="text"></td>
                            <td><input id="preboard11" type="text"></td>
                            <td><input id="Toatl11" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name12" type="text"></td>
                            <td><input id="ass12" type="text"></td>
                            <td><input id="report12" type="text"></td>
                            <td><input id="midterm12" type="text"></td>
                            <td><input id="presentation12" type="text"></td>
                            <td><input id="preboard12" type="text"></td>
                            <td><input id="Toatl12" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name13" type="text"></td>
                            <td><input id="ass13" type="text"></td>
                            <td><input id="report13" type="text"></td>
                            <td><input id="midterm13" type="text"></td>
                            <td><input id="presentation13" type="text"></td>
                            <td><input id="preboard13" type="text"></td>
                            <td><input id="Toatl13" type="text"></td>
                        </tr>

                        <tr>
                            <td><input id="name14" type="text"></td>
                            <td><input id="ass14" type="text"></td>
                            <td><input id="report14" type="text"></td>
                            <td><input id="midterm14" type="text"></td>
                            <td><input id="presentation14" type="text"></td>
                            <td><input id="preboard14" type="text"></td>
                            <td><input id="Toatl14" type="text"></td>
                        </tr>

                    </tbody>
                </table>

            </div>
            <button type="button" class="btn btn-primary" data-toggle="button" onclick="" >Save</button>
        </div>



        <script src="assets/js/jquery.min.js" type="text/javascript"></script>
        <script src="assets/js/transition.js" type="text/javascript"></script>
        <script src="assets/js/collapse.js" type="text/javascript"></script>


    </body>
</html>
