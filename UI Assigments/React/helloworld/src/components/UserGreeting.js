import React, { Component } from 'react'

class UserGreeting extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
             isLoggedIn: true
        }
    }    
    render() {
        if(this.state.isLoggedIn){
            return <div>Hello Rahul </div>
        }else{
            return <div>Hello Shaik</div>
        }
    }
}

export default UserGreeting
