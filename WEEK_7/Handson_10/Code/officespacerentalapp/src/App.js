import React from 'react';
import './App.css';

function App() {
  const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const imageUrl = "https://tse4.mm.bing.net/th/id/OIP.FG7luGfV0XwYUBom2_HxfAHaHa?pid=Api&P=0&h=180";

  const rentStyle = {
    color: ItemName.Rent <= 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  };

  return (
    <div className="App">
      <h1>Office Space , at Affordable Range</h1>
      <img src={imageUrl} alt="Office Space" width="300" height="200" />
      <h2>Name: {ItemName.Name}</h2>
      <h3 style={rentStyle}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;
