import React, { useState } from 'react';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  
  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);
  
  let pageContent;
  if (isLoggedIn)     pageContent = <UserPage />;
  else                pageContent = <GuestPage />;
  

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h1>Ticket Booking App</h1>
      {pageContent}
      <br />
      {isLoggedIn ? (
        <button onClick={handleLogout}>Logout</button>
      ) : (
        <button onClick={handleLogin}>Login</button>
      )}
    </div>
  );
}

function GuestPage() {
  return (
    <div>
      <h2>Please sign up.</h2>
    </div>
  );
}

function UserPage() {
  return (
    <div>
      <h2>Welcome back</h2>
    </div>
  );
}

export default App;
