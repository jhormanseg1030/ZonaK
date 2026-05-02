import { useState } from 'react'
import { Route, Routes } from 'react-router-dom'
import InicioSesion from './components/Inicio/InicioSesion'

function App() {
  const [Count, SetCount] = useState(0)
  return(
    <Routes>
      <Route path='/' element={<InicioSesion></InicioSesion>}></Route>
    </Routes>
  )
}

export default App
