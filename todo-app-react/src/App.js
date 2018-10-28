import React, { Component } from "react";
// import logo from './logo.svg';
import "./App.css";
import CheckBox from "./CheckBox";

class App extends Component {
  constructor() {
    super();

    this.state = {
      todo: "",
      // todos: ["Eat", "Code", "Sleep", "Repeat"],
      todos: [
        { display: "Eat", isDone: false, isUrgent: false },
        { display: "Code", isDone: false, isUrgent: false },
        { display: "Sleep", isDone: false, isUrgent: false },
        { display: "Repeat", isDone: false, isUrgent: false }
      ],
      todoIndex: null
    };
  }

  addTodo = e => {
    this.setState({ todo: e.target.value });
  };

  addTodos = () => {
    const { todos, todo, todoIndex } = this.state;
    if (todoIndex === null) {
      todos.push({ display: todo, isDone: false, isUrgent: false });
    } else {
      todos[todoIndex].display = todo;
    }
    this.setState({ todos, todo: "", todoIndex: null });
  };

  boxClick = (value, index) => {
    const { todos } = this.state;
    todos[index].isDone = !todos[index].isDone;
    this.setState({ todos });
  };

  urgentClick = (value, index) => {
    const { todos } = this.state;
    todos[index].isUrgent = !todos[index].isUrgent;
    this.setState({ todos });
  };

  deleteHandler(todoIndex) {
    const { todos } = this.state;
    // const todos = [...this.state.todos];
    todos.splice(todoIndex, 1);
    this.setState({ todos: todos });
  }

  editHandler(todoIndex) {
    const { todos } = this.state;
    // const todos = [...this.state.todos];
    const todo = todos[todoIndex].display;
    this.setState({ todo, todoIndex });
  }

  renderTodos = () => {
    return this.state.todos.map((value, index) => (
      <div key={index}>
        {value.display}
        <div className="everythingOnOneLine">
          <button className="myButton" onClick={() => this.editHandler(index)}>
            Edit
          </button>
          <button
            className="myButton"
            onClick={() => this.deleteHandler(index)}
          >
            Delete
          </button>
          <CheckBox
            title="Done"
            value={value.isDone}
            onClick={e => this.boxClick(e.target.value, index)}
          />
          <CheckBox
            title="Urgent"
            value={value.isUrgent}
            onClick={e => this.urgentClick(e.target.value, index)}
          />
        </div>
      </div>
    ));
  };

  render() {
    console.log(this.state.todos);
    return (
      <div className="App">
        <header className="App-header">
          <h1> Todo App </h1>
        </header>
        <body>
          <p>{this.renderTodos()}</p>
          {this.state.todo}
          <input value={this.state.todo} onChange={this.addTodo} />
          <button className="submitButton" onClick={this.addTodos}>
            Add new Todo
          </button>
        </body>
        <footer>
          <p>Powered by Dave</p>
        </footer>
      </div>
    );
  }
}

export default App;
