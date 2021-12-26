
import React,{Component} from 'react';
import './App.css';
import Class from './components/Class';
import EventBind from './components/EventBind';
import FunctionClick from './components/FunctionClick';
import Greet from './components/Greet'
import Message from './components/Message';
import NameList from './components/NameList';
import UserGreeting from './components/UserGreeting';
import Welcome from './components/Welcome'
 class App extends Component{
 render(){
  return (
    <div className="App">
      <Greet name="World"  />
      {/*<NameList/>
      {/*<UserGreeting/>
      {/*<EventBind/>
      {/*<FunctionClick/>
      <Class/>
      {/*<Message/>
     {/*<Welcome />*/}
    </div>
  );
}
}
export default App;
