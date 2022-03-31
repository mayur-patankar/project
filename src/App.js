import { useEffect, useRef, useState } from "react";
import "./App.css";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import { io } from "socket.io-client";
import Home from "./components/Home";
import ChatApp from "./components/ChatApp";


function App() {

  
  return (
    <BrowserRouter>
      <Link to="/">HOME</Link>
      <Link to="/chat">ChatApp</Link>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
        <Route path="/chat" element={<ChatApp/>}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;