//Checking Variable Scope  

function myHalfName(name){
    if(name=="Rahul"|| name=="Rah") {
    let message = "Hii, Rahul!!!";
    console.log(message); // Output: Hii, Rahul!!!
     }
 console.log(message); // Output: Uncaught ReferenceError: message is not defined
 }

 myHalfName("Rah");