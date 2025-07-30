import React, { useState } from 'react';
import './App.css';

function App() {
  const [count, setCount] = useState(5); 

  const increment = () => setCount(count + 1);
  const decrement = () => setCount(count - 1);

  const sayWelcome = () => {
    alert("Hello! Member1");
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h2>{count}</h2>

      <button onClick={increment}>Increment</button>
      <br />
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={sayWelcome}>Say welcome</button>
      <br />
      <button onClick={handleClick}>Click on me</button>

      <CurrencyConverter />
    </div>
  );
}

function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const result = parseFloat(amount) * 80;
    alert(`Converting to ${currency} Amount is ${result}`);
  };

  return (
    <div style={{ marginTop: '30px' }}>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Amount:</label>{' '}
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
        <br />
        <label>Currency:</label>{' '}
        <textarea
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        />
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
