<?php
	// BASICS   : 
	/* <? can use short-hand tag as long as supported by the server ?> */
	
	/* <script language = "PHP"> some versions don't support this anymore </script>
	Multi line
	Comments
	*/
	
	echo "Hello World!";							// simply prints a text
	echo '<strong> Hello Universe! </strong>';		// can use html markups to text in the text
	
	// VARIBLES :
	$variable_name = "value";						// variable names are case sensitive
	$age = 100;										// variables are created when assign a value
	define(name,"value",true);						// creating a constant # define(name,value,case-insensitive); default - false
	echo "name";									// output : 'value'
	// Data types : String,Integer(+/-),Float,Boolean(true,false),Array,Object,NULL,Resource
	echo $variable_name.$name;						// join 2 strings using concatenation (.) operator
	$str = "200";
	$sum = $age + $str;								// value : 300 	# automatically convert values to the necessary type
	$a = "hello";
	$hello = "Hi";
	echo $$a;										// output : 'Hi' # Double variables
	
	// SCOPES :
	$nme = 'David';									// variable in global scope
	function getNme(){
		global $nme;								// addede later : global keyword used to access a global variable frm a func.
		echo $name;									// not accessible within local scope
	}
	getNme();										// output : Error : Underfined variable: nme / later : runs
	
	//	OPERATORS :
	$num1 = 8;
	$num2 = 6;
	echo $num1 + $num2 ;		// + - * % 	# if use floating numbers with modulus, they will be converted to integers b4 operation.
	echo $num1 / $num2 ;		// / generates a float
	$num1++;					// post incremet : reurns original value b4 it changes the varible (a=9 b=8)
	--$num2;					// pre decrement : first change the original value, then return the value. (a=9 b=9)
	$a = 12 ;
	$b += $a ;					// same as # b = b + a , 
	echo $a == $b ;				// comparison operators #(== equal, === identical, != not equal, <> not equal, !== not identical, > greater than, < less than, >= greater than or equals, <= less than or equals)
	echo true && false ;		// output : false : logical operators (&& and , || or, ! not, and, or, xor)
	
	// ARRAYS
	// Numeric Arrays
	$names = array("David","Amy","John");		// creating arrays / can have different data types in one array
	echo $names[0] ;							// output : "David"
	
	// Associative Arrays 
	$people = array("David"=>"27"), "Amy"=>"21", "John"=>"42";	// or
	$people['David'] = "27";
	$people['Amy'] = "21" ;
	echo $people['John'] ; 					// output : "42"
	
	// Multi Dimentional Arrays
	$peoples array(							// multi dimentional arrays can be both numeric and associative
		'online' => array('David','Amy');
		'offline' => array('John','Bob','Jack');
		'away' => array('Arthur', 'Daniel');
	)
	echo $peoples['online'][1]; 			// output : 'Amy'
	
	// CONTROL STRUCTURES
	if(true){
		// code
	}
	elseif(true){
		// code
	}
	else{
		// code
	}
	
	while($a<12){
		// code
		$a++;
	}
	
	do{
		// code runs at least once
		$a++;
	}
	while($a<10);
	
	for($z=0;$z<5;$z++){				// each parameter expression can be empty or multiple with comma separated
		// code
	}
	
	foreach($names as $values){			//(array as $value) # each loop current value assigned to $value. array pointer moved by one. until it reaches the last array element.
		// code
	}
	foreach($names as $key => $value){			// (array as 'key' => $value) # assign current elements key to the $key variable on each iteration.
		// code
	}
	
	switch($val){
		case "one":
			// code								// if break not included. runs down through no matter what case is.
			break;								// stop the loop
		case "two":
		case "three":							// runs until reach to break/continue.
			// code
			continue;							// skip the current iteration cycle
		default:
			// code execute when no match found # exceptional
	}
	
	// INCLUDE
	// allows for the insertion of the contents of one php file into another php file before server execute it.
	// 
	<?php 		// header.php file
		echo '<h1> Welcome </h1>';
	?>
	<html>		// html file
		<body> <?php include 'header.php'; ?> </body> 
	</html>
	// REQUIRE
	// identical to include, except upon failure this cease execution and produces a fatal error.
	// when file include using include statement, but PHP unable to find it, script continues to execute.
	
	// FUNCTIONS
	function funcName($link,$nick = "user"){		// default argument in case of $nick absence	// function names are not case-sensitive // default should be right side of the non defaluts. otherwise may cause unexpected outputs.
		echo "Hi ".$nick" you are ".$link;
		$ret = $nick."asdfg";
		return $ret;								// return a value	// if not defined returns NULL value // can return arrays
	}
	funcName("http","Neo");									// calling a function  # passes two args
	
	// PREDEFINED VARIABLES
	
	// a superglobal is a predefined variable that is always accessible, regardless of scope. access superglobals through any function,class or file. Eg:
		// $_SERVER, $_GLOBALS, $_REQUEST, $_POST, $_GET, $_FILES, $_ENV, $_COOKIE, $_SESSION.
	
	// $_SERVER : is an array that includes informations such as headers,paths and script locations. entries in the array are created by the web server.
	echo $_SERVER['SCRIPT_NAME'];							// returns the path of the current script
	echo $_SERVER['HTTP_HOST'];								// returns the host header from the current request
	echo $_SERVER['PHP_SELF'];								// returns filename of the current exxecuting script
	echo $_SERVER['SERVER_ADDR'];							// returns ip address of the host server
	echo $_SERVER['SERVER_NAME'];							// returns name of the host server
	echo $_SERVER['REMOTE_ADDR'];							// returns ip address from where the user is viewing the current page
	echo $_SERVER['REMOTE_HOST'];							// returns host name from where the user is viewing the current page
	echo $_SERVER['REMOTE_PORT'];							// return the port being used on the user's machine to communicate web
	echo $_SERVER['SCRIPT_FILENAME'];						// returns absolute pathname of the currently executing script
	echo $_SERVER['SERVER_PORT'];							// returns port on the server machine used to communication
	echo $_SERVER['SCRIPT_URL'];							// returns the url of the current page
	
	// FORMS
		// $_GET		shows form data in address bar
		// $_POST		hides contents
		// are arrays used to collect data from forms # holds key/ value pairs 
	
	// $_SESSION			superglobal
	// session_start() 		method must be the first thing in the document before any html tag
	<?php 
	session_start();
	$_SESSION['color'] = "red";
	$_SESSION['name'] = "John";
	
	// session variable color & name are available in multiple pages until user closed the browser & end the session
	?>		
	session_unset();			// remove all global session variables manually
	session_destroy();			// destroy the session
	
	// example
	<?php
		session_start();
	?>
	<!DOCTYPE html>
	<html>
	<body>
		<?php
			echo "Your name is".$_SESSION['name'];
		?>
	</body>
	</html>
	
	// COOKIE
	setcookie(name,value,expire,path,domain,secure,httponly);
	
	
?>