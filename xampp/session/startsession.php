<?php
    session_start();

    if(isset($_SESSION["ww"])) {
        $_SESSION["ww"] += 1;
    }
    else {
        $_SESSION["ww"] = 1;
    }

    print "You have visited ".$_SESSION["ww"]." times.";

    header("location:next.php");

?>