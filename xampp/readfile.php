<?php
    $file = fopen("C:/xampp/htdocs/xampp/sample.txt", "r");

    if($file == false) {
        print "file couldnot be opened.";
        exit();
    }

    $size = filesize("C:/xampp/htdocs/xampp/sample.txt");
    print $size;
    $text = fread($file, $size);
    print "<pre>$text</pre>";

    fclose($file);
?>