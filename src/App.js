import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from "react-router-dom"
import Home from "./components/Home.js"
import Register from './components/Register';
import Login from './components/Login';
import MyProds from './components/MyProds';
import EditProd from './components/EditProd';
import AddProd from './components/AddProd';

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<MyProds/>}></Route>
          <Route path="/editProd" element={<EditProd/>}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
