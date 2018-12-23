<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>TEST</title>
    <!--CSS -->
    <link rel="stylesheet" href="css/test.css">


    <!-- Custrom boostrap script  ... -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
    <script src="js/all.js"></script>
    <!-- Scripts -->
    <script src="js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $(document).ready(function(){
            $("#btn-start").click(function(){
                $("#start-page").fadeOut("slow");
                $(".intro").fadeIn(5000);
            });
            $("#start-test").click(function(){
                $("#section1").fadeOut("slow");
                $("#section2").fadeIn(5000);
            });
        });
    </script>
</head>

<body>
    <nav class="breadcrumb">
        <a class="breadcrumb-item" href="index.php">Home</a>
        <a class="breadcrumb-item" href="test.php">TEST</a>
    </nav>
    <div id="start-page">
        
        <div id="title">
            <h1>When You Ready!! Start Start Button</h1>
        </div>
        <div id="start-btn">
            <button type="button" id ="btn-start" class="btn btn-danger">Start</button>
        </div>
    </div>
    <div class="container intro" style="display: none;">
        <div id="section1">
            <h4 id="title-intro">The test based on real exam questions</h4>
            <h1 id="title-sol"><span>PRACTICE FOR</span> THE TOEIC</h1>
            <p class="para-warning">Based on the TOEIC exam structure,
                    this test has a total of 7 sections, 
                    including 4 parts Listening and 3 Reading sections. 
                    This is a sample lesson to help you prepare for the TOEIC exam, 
                    with the number of questions being cut to one fifth compared to the actual TOEIC lesson.
            </p>
            <p class="para-warning">
                The results of this test are assessed on the basis of TOEIC scoring method. 
                The score you receive will not guarantee your actual TOEIC test score,
                    but will more or less reflect your ability to achieve a similar score.
            </p>
            <br><br>
            <h3 class="warning">WHERE ARE YOU READY TO THE TOEIC TEST? CHECK NOW!</h3>
            <h4 class="warning">Note: For honest results, you should try to complete the test within 30 minutes.</h4>
            <br><br>
            <div id="start-test">
                <button type="button" class="btn btn-info btn-lg">Start The Test</button>
            </div>
        </div>

        <div id="section2" style="display: none;">
            <div id="testing-listen">
                <div id="play-btn">
                    <button type="button" onclick="playAudio()" class="btn btn-info btn-lg"><i class="fas fa-play-circle"></i></button>
                    <audio id="myAudio">
                        <source src="audio/testAudio.mp3" type="audio/ogg">
                    </audio>

                    <script>
                        var x = document.getElementById("myAudio"); 
                        
                        function playAudio() { 
                            x.play(); 
                        } 
                        
                        function pauseAudio() { 
                            x.pause(); 
                        } 
                    </script>
                </div>
                <br><br>
                <div id="listen-warning">
                    <h1>BEFORE GO TO THE TEST, PLEASE CHECK YOUR HEADPHONE FIRST BY CLICK TO THE AUDIO BUTTON</h1>
                    <p>In this section of the test, you will have the chance to showw how well
                        you understand spoken English.
                    </p>
                    <br><br><br>
                    <div id="go-test">
                        <button type="button" class="btn btn-info btn-lg">GO!!!</button>
                    </div>
                </div>
            </div>
        </div>
        
    </div>
</body>

</html>