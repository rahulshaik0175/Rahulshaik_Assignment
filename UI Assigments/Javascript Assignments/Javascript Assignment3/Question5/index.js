const person = {
    firstName : "Rahul",
    lastName : "Shaik",
    greeting : function(){
        alert('Hi! I\m ' + this.firstName + this.middleName + this.lastName + '.');
    }
};

document.write(person.firstName + " ");
person.middleName = "s";
document.write(person.middleName + "  ");
document.write(person.lastName);
console.log(person.greeting());