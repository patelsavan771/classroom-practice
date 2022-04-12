<?php
   setcookie("name","lokesh",time()+1200)
?>
<?php
  if(isset($_COOKIE["name"]))
  {
      echo "welcome".$_COOKIE["name"];
  }
  else{
      echo "FIRST VISIT";
  }
?>