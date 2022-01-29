import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter,
  Route,
  Routes,
} from "react-router-dom";
import {Home} from "./Components/home.js"
import {Login} from "./Components/Login.js"
import {Register} from "./Components/Register.js"
import {Seller} from "./Components/Seller.js"
import {Bidder} from "./Components/Bidder.js"
import {Admin} from "./Components/Admin.js"

function App() {
  return (
        <>
      {<BrowserRouter>
        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/seller" element={<Seller />} />
          <Route path="/bidder" element={<Bidder />} />
          <Route path="/Admin" element={<Admin />} />
        </Routes>
      </BrowserRouter>}
    </>
/*
<div>
      <Login/>
      <Register/>
</div>
      */
  );
}

export default App;
