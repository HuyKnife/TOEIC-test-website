<?php
    require_once("config/config.php");
    session_start();

    if (!isset($_SESSION['email'])) {
    $_SESSION['msg'] = "You must log in first";
    header('location: login.php');
}
?>

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
        var x = document.getElementById("myAudio"); 
        $(document).ready(function(){
            $("#btn-start").click(function(){
                $("#start-page").fadeOut("slow");
                $("#next").hide();
                $(".intro").fadeIn(4000);
            });
            $("#start-test").click(function(){
                $("#section1").fadeOut("slow");
                $("#section2").fadeIn(4000);
                $("#next").hide();
            });
            $("#go-test").click(function(){
                x.pause();
                $("#next").hide();
                $("#section2").hide();
                $("#section3").fadeIn(4000);
                $("#questionDetail").hide();
                $("#Direction").hide();
                $("#clock").show();
            });
            $("#startAudioClick").click(function () {
                $("#label-warning").fadeOut();
                $("#main-part").fadeIn(4000);
                $("#q0").fadeIn(4000);
                $("#next").fadeIn(4000);
                $("#Direction").fadeIn(4000);
            });
            $("#next").on('click', function() {
                $('#questions>div').each(function() {
                var id = $(this).index();
                if ($(this).is(':visible')) {
                    $(this).hide();
                    if (id == $('#questions>div').length - 1) {
                        $('#questions>div').eq(0).show();
                    } else {
                        $('#questions>div').eq(id + 1).show();
                    }
                    return false;
                }
            });
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
            <h1>When You Ready!! Press Start Button</h1>
        </div>
        <div id="start-btn">
            <button type="button" id="btn-start" class="btn btn-danger">Start</button>
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
            <h4 class="warning">Note: For honest results, you should try to complete the test within 45 minutes
                in Listening Part.</h4>
            <br><br>
            <div id="start-test">
                <button type="button" class="btn btn-info btn-lg">Start The Test</button>
            </div>
        </div>

        <div id="section2" style="display: none;">
            <div id="testing-listen">
                <div id="play-btn">
                    <button type="button" onclick="playAudio()" id="audioTest"class="btn btn-info btn-lg"><i class="fas fa-play-circle"></i></button>
                    <audio id="myAudio">
                        <source src="audio/testAudio.mp3" type="audio/ogg">
                    </audio>

                    <script>
                        var x = document.getElementById("myAudio"); 
                        
                        function playAudio() { 
                            x.play(); 
                        } 
                    </script>
                </div>
                <br><br>
                <div id="listen-warning">
                    <h1>BEFORE GO TO THE TEST, PLEASE CHECK YOUR HEADPHONE FIRST BY CLICK TO THE AUDIO BUTTON</h1>
                    <p>In this section of the test, you will have the chance to show how well
                        you understand spoken English.
                    </p>
                    <br><br><br>
                    <div id="go-test">
                        <button type="button" class="btn btn-info btn-lg">GO!!!</button>
                    </div>
                </div>
            </div>
        </div>

        <div id="section3" style="display: none;">
            <div id="main-part">
                <div id="audio-part">
                    <div id="play-btn">
                        <button type="button" onclick="startAudio()" id="startAudioClick" class="btn btn-info btn-lg"><i
                                class="fas fa-play-circle"></i></button>
                        <!-- timer -->
                        <div id="clock" style="display: none; font-size: 20px;"> 
                            <div id="clockPart">
                                <span>Timer</span> 
                                <span id="time">45:00</span> 
                                <span>minutes!</span>
                            </div>
                        </div>
                        <audio id="audioReady">
                            <source src="audio/Audio TOEIC.mp3" type="audio/ogg">
                        </audio>
                        <div id="label-warning">
                            <h1>When You Click The Play Button The Clock Will Count And You Can Not Pause The Audio</h1>
                        </div>
                        <script>
                            var y = document.getElementById("audioReady"); 
                            var audioButton = document.getElementById("startAudioClick")
                            
                            function startAudio() { 
                                y.play(); 
                                var fiveMinutes = 60 * 45,
                                display = document.querySelector('#time');
                                startTimer(fiveMinutes, display);
                                audioButton.disabled = true;
                            } 

                            function startTimer(duration, display) {
                                var timer = duration, minutes, seconds;
                                setInterval(function () {
                                    minutes = parseInt(timer / 60, 10)
                                    seconds = parseInt(timer % 60, 10);

                                    minutes = minutes < 10 ? "0" + minutes : minutes;
                                    seconds = seconds < 10 ? "0" + seconds : seconds;

                                    display.textContent = minutes + ":" + seconds;

                                    if (--timer < 0) {
                                        timer = duration;
                                    }
                                }, 1000);
                            }
                        </script>
                    </div>
                </div>

                <div id="Direction">
                    <p>
                        <span style="font-weight: bold;">DIRECTION: </span> For each question in this part, you will
                        hear four statements about a picture in
                        your test book. When you hear the statements, you must select the one statement that best
                        describes what you see in the picture. Then find the number of the question on your answer
                        sheet and mark your answer. The statements will not be printed in your test book and will be
                        spoken only one time.
                    </p>
                </div>
                
                <div id="questions">
                    <div id="q0" style="display: none;">
                    <?php
                        for($i = 1; $i < 11; $i++) {
                            $query = "SELECT * FROM listening where id = $i";
                            $result = $conn->query($query);
                            while($row = $result->fetch_assoc()) {
                    ?>
                    <div id = "container-fluid">
                        <div id="container-fluid"  style ="margin: 20px 0px">
                            <div id="imagePart">
                                <div><?php echo $row['id'] ?></div>
                                <img src="<?php echo $row['img'] ?>" alt="" class="img-thumbnail">
                                <div id="answer" style = "display: inline-block; float: right">
                                <button type="button" class="btn btn-brand btn-twitter">A <br>
                                    <button type="button" class="btn btn-brand btn-twitter">B <br>
                                        <button type="button" class="btn btn-brand btn-twitter">C <br>
                                            <button type="button" class="btn btn-brand btn-twitter">D <br>
                                </div>
                            </div>
                        </div>
                    </div>
                    <?php 
                        }
                    }
                    ?>
                    </div>


                    <div id="q1" style="display: none;">
                    <?php
                        for($i = 11; $i < 41; $i++) {
                            $query = "SELECT * FROM listening where id = $i";
                            $result = $conn->query($query);
                            while($row = $result->fetch_assoc()) {
                    ?>
                    <div id = "container-fluid">
                        <div id="container-fluid">
                            <div id="imagePart">
                                <div id="answer">
                                <?php echo $row['id'] ?>
                                <button type="button" class="btn btn-brand btn-twitter">A <br>
                                    <button type="button" class="btn btn-brand btn-twitter">B <br>
                                        <button type="button" class="btn btn-brand btn-twitter">C <br>
                                            <button type="button" class="btn btn-brand btn-twitter">D <br>
                                </div>
                            </div>
                        </div>
                    </div>
                    <?php 
                        }
                    }
                    ?>
                    </div> 
                
                    <div id="q2" style="display: none;">
                    <?php
                        for($i = 41; $i < 101; $i++) {
                            $query = "SELECT * FROM listening where id = $i";
                            $result = $conn->query($query);
                            while($row = $result->fetch_assoc()) {
                    ?>
                    <div id = "container-fluid">
                        <div id="container-fluid">
                            <div id="imagePart">
                                <div id="answer">
                                <?php echo $row['id'] ?>
                                <button type="button" class="btn btn-brand btn-twitter">A <br>
                                    <button type="button" class="btn btn-brand btn-twitter">B <br>
                                        <button type="button" class="btn btn-brand btn-twitter">C <br>
                                            <button type="button" class="btn btn-brand btn-twitter">D <br>
                                </div>
                            </div>
                        </div>
                    </div>
                    <?php 
                        }
                    }
                    ?>
                    </div> 
                </div>
            </div>
        </div>

        <div id="nextQuesion">
            <div id="next">
                <button type="button" class="btn btn-square btn-success">Next Page</button>
            </div>
        </div>

        <div id="result"style="display: none;">
            <div id="resultLabel">
                <h1>Your score:</h1>
                <div id="listenRes"><span>Listening:</span>30</div>
                <div id="readRes"><span>Reading:</span>20</div>
                <div id="totalRes"><span>Total:</span>50</div>
                <a href="index.php" id="returnHome"><i class="fas fa-home"></i>Return to homepage</a>
            </div>
        </div>
    </div>
    
</body>

</html>