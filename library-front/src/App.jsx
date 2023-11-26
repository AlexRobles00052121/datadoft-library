import { BrowserRouter as Router, Route, Routes, Navigate } from 'react-router-dom';
import Login from './pages/Login/Login';
import InApp from './pages/InApp/InApp';
import Register from './pages/Register/Register';

function App() {

  return (

    <Router>
      <Routes>
        <Route path="/" element={<Navigate to="/login" />} />
        <Route path="/login" element={<Login />} />

        <Route path="/register" element={<Register />} />
        <Route path="/principal" element={<InApp />} />
      </Routes>
    </Router>

  )
}

export default App
