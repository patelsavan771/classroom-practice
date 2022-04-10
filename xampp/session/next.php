<?php 
    session_start();

    if(isset($_SESSION["ww"])) {
        print "value = ".$_SESSION["ww"];
    }
    else {
        print "Session not set.";
    }

    session_destroy();

?>