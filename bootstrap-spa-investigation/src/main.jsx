import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'

import "bootstrap/dist/css/bootstrap.min.css";
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import HomePage from './pages/HomePage.jsx'
import AboutUsPage from './pages/AboutUsPage.jsx'
import ContactUsPage from './pages/ContactUsPage.jsx'


const router = createBrowserRouter([
  {
    path: '/', 
    element: <App/>,
    children: [
      { index: true, element: <HomePage/> }, 
      { path: 'about', element: <AboutUsPage/> },
      { path: 'contact', element: <ContactUsPage/> },
    ]
  }
]);

createRoot(document.getElementById('root')).render(
  <StrictMode>
    
    <RouterProvider router={router}/>
  </StrictMode>,
)
