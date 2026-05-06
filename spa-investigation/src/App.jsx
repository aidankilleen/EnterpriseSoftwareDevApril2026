import { Outlet } from 'react-router-dom'
import './App.css'
import MainNavigation from './components/MainNavigation'

function App() {


  return (
    <>
      <h2>Single Page Application Investigation</h2>

      <MainNavigation/>

      <main>
        <Outlet/>
      </main>

    </>
  )
}

export default App
