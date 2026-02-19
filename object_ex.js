//Create an object
const person = {firstName:"latha", lastName:"dakamarri",age:20,eyecolor:
"black"};
const person1=new Object({
    firstName:"latha",
    lastName:"dakamarri",
    age:20,
    eyecolor:"black"
});




const person2={
    firstName:"latha",
    lastName:"dakamarri",
    age:20,
    eyecolor:"black",
    fullName:function(){
        return this.firstName+""+this.lastName;
    }
 
};
console.log(person2.age);
console.log(person2.fullName());
