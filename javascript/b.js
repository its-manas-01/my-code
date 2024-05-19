// for(let i=0;i<=100;i++)
// {
//     if(i%2==0)
//     {
//         console.log(i);
//     }
// }
// let num=20;

// let a = prompt("guess a number:-");

// while (a!=num)
//     {
//         a=prompt("guess a number");
//     }
// let a=[250,645,300,900,50];

// for(let i=0;i<a.length;i++)
//     {
//         a[i]=a[i]*(90/100);
//     }

//     console.log("Price after discount");
//     console.log(a);



// function x(a)
// {
//     let vowel=0,con=0;
//     let b=a;
//     for(let i=0;i<b.length;i++)
//         {
//             if(b[i]=="a"||b[i]=="e"||b[i]=="i"||b[i]=="o"||b[i]=="u"||b[i]=="A"||b[i]=="E"||b[i]=="I"||b[i]=="O"||b[i]=="U")
//                 {
//                     vowel++;
//                 }
//             else
//             {
//                 con++;
//             }
//         }
//         console.log("number of vowels are:-"+vowel);
//         console.log("number of consonants are:-"+con);
// }

// let arrowstring = (a) => {
//     let vowel=0,con=0;
//     let b=a;
//     for(let i=0;i<b.length;i++)
//         {
//             if(detact(b[i])==true)
//                 {
//                     vowel++;
//                 }
//             else
//             {
//                 con++;
//             }
//         }
//         console.log("number of vowels are:-"+vowel);
//         console.log("number of consonants are:-"+con);
// }
// function detact(x)
// {
//     if (x=="a"||x=="e"||x=="i"||x=="o"||x=="u"||x=="A"||x=="E"||x=="I"||x=="O"||x=="U")
//         {
//             return true;
//         }
// }

// let a=prompt("enter a string");
// arrowstring(a);


// let arr=[1,2,3,4,5,6,7,8,9,10];
// arr.forEach(function squre(val)  {
//     console.log(val+" = "+val*val);
// });
// arr.forEach((val)=>{
//     console.log(val+" = "+val*val);
// });


// let arr=[87,93,64,99,86101];

// let newarr=arr.filter((val)=>{
//     return val>90
// });
// console.log(newarr);


let max=prompt();
let arr=[];
for(let i=1;i<=max;i++)
    {
        arr.push(i);
    }
    console.log(arr);
let n=arr.reduce((result,current)=>
{
    return result + current;
});
console.log("sum of all number is " + n);
let x=arr.reduce((result,current)=>
    {
        return result * current;
    });
console.log("product of all number is " + x);