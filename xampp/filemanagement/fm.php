<!-- write a php script to copy all the content of b1.txt file to b2.txt file.
show on browser how many numbers of latters are copied. -->

<?php
    $file = fopen("C:/xampp/htdocs/xampp/filemanagement/b1.txt", "r");
    $file1 = fopen("C:/xampp/htdocs/xampp/filemanagement/b2.txt", "w");
    if($file == false) {
        print "file couldnot be opened.";
        exit();
    }

    $size = filesize("C:/xampp/htdocs/xampp/filemanagement/b1.txt");

    
    $text = fread($file, $size);
    fwrite($file1, $text);

    $c = 0;
    for($i = 0; $i < strlen($text); $i++) {
        if($text[$i] == " ") {
            $c++;
        }
        if($text[$i] == "\n") {
            $c += 2;
        }
    }
    print $size - $c;
    print "<br>c".$c;
    print "<br>size".$size;
    print "<br>".$text;

    fclose($file);
?>