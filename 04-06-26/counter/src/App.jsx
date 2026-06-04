import { useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(10)
  const [clicks, setClicks] = useState(0)
  return (
    <>
     <div>{count}</div>
      <button onClick={() => {
        if(clicks < 5) {
        setClicks(()=>clicks + 1)
        }else  {
          setCount(20)
        }
      }}>+</button>
    </>
  )
}

export default App
