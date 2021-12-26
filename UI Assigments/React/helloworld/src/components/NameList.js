import React from 'react'

function NameList() {
    const persons = [
        {
            id:1,
            name:'Rahul',
            age:21,
            skill:'React'
        },
        {
            id:2,
            name:'shaik',
            age:22,
            skill:'Angular'
        },
        {
            id:3,
            name:'pavan',
            age:22,
            skill:'Devops'
        }

    ]
    const personList =persons.map(person =>(
        <h2>
            I am {person.name}.I am {person.age} years old. I know {person.skill}
        </h2>
    ))
    return (
        <div>{personList}</div>
    )
}

export default NameList
