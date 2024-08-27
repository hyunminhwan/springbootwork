import './App.css';
import { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [hello, setHello] = useState("");

  useEffect(() =>{
    axios.get('/api/test')
          .then(result =>{
            console.log(result.data);
            setHello(result.data)
            
          })
  })

  return (
    <div className="App">
        <h3>서버에서 들어오는 값 : {hello}</h3>
    </div>
  );
}

export default App;
