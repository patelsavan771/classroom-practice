<?php 
    if(isset($_GET["uname"]) && isset($_GET["age"])) {
        print "Welcome ".$_GET["uname"];
        print ". You are ".$_GET["age"]." years old";
        $age = $_GET["age"];
        myref($age);
        print "<br><br> let's try pass by reference : ".$age;
        exit();
    }

    function myref(&$x) {
        $x -= 18;
    }

?>