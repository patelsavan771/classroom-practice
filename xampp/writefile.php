<?php
    $file = fopen("C:/xampp/htdocs/xampp/sample1.txt", "w");

    if($file == false) {
        print "file couldnot be opened.";
        exit();
    }

    $text = "this is example of file write";
    
    fwrite($file, $text);
    fclose($file);
?>