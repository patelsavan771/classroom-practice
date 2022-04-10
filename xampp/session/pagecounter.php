<?php

    session_start();

    if(isset($_SESSION["view"])) 
    {
        $_SESSION["view"]++;    
    }
    else
    {
        $_SESSION["view"] = 1;
    }

    print "current page views = ".$_SESSION["view"];

    // session_destroy();

?>