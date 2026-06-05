import React, { useState } from 'react'

const App = () => {
  const [number, setNumber] = useState(10);
  const [clickCount,setClickCount]=useState(0);
  const handleClick = () => {
    const newCount = clickCount + 1;

    if (newCount === 3) {
      setNumber((prev) => prev * 2);
      setClickCount(0); 
    } else {
      setClickCount(newCount);
    }
  };
  return (
    <div>
      <div>
        {number}
      </div>
      <button onClick={handleClick}>Click me</button>
    </div>
  )
}

export default App
