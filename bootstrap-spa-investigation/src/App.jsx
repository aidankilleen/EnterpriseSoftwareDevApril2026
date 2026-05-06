import { Button, Container } from 'react-bootstrap'

import { Outlet } from 'react-router-dom'
import MainNav from './page-conmponents/MainNav'

function App() {

  return (
    <>
    <Container fluid>
      <h1>Bootstrap</h1>
      <MainNav/>
      <Outlet/>
    </Container>
    </>
  )
}

export default App
