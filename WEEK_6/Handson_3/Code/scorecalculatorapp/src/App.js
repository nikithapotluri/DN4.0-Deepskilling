import React from 'react';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name="Sleeve"
        School="DNV Public School"
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
