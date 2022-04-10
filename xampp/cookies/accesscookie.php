<?php

    if(isset($_COOKIE["uname"])) {
        echo "welcome ".$_COOKIE["uname"];
    }
    else {
        echo "Cookie not set.";
    }

?>