import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import { createBrowserRouter, RouterProvider } from 'react-router-dom'
import HomePage from './pages/HomePage.jsx'
import AboutUsPage from './pages/AboutUsPage.jsx'
import ContactUsPage from './pages/ContactUsPage.jsx'
import EffectInvestigationPage from './pages/EffectInvestigationPage.jsx'

const router = createBrowserRouter([
  {
    path: '/', 
    element: <App/>,
    children: [
      { index: true, element: <HomePage/> }, 
      { path: 'about', element: <AboutUsPage/> },
      { path: 'contact', element: <ContactUsPage/> },
      { path: 'effect', element: <EffectInvestigationPage/> },
    ]
  }
]);

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <RouterProvider router={router}/>
  </StrictMode>,
)
