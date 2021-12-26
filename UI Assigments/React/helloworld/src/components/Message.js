import React, { Component } from 'react'

export class Message extends Component {
    constructor(){
        super()
        this.state={
            message: 'welcome visitor'
        }
    }
    render() {
        return (
            <h1>
             {this.state.message}
            </h1>
        )
    }
}

export default Message
