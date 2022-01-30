import axios from "axios";
import { useState } from "react/cjs/react.development";

export function Seller()
{
    const [name, setName] = useState("");
    const checkname = (e) => {
        setName(e.target.value) 
    }
    const [date, setDate] = useState("");
    const checkdate = (e) => {
        setDate(e.target.value) 
    }
    const [description, setDescription] = useState("");
    const checkdisc = (e) => {
        setDescription(e.target.value) 
    }
    const [category, setCategory] = useState("");
    const checkcate = (e) => {
        setCategory(e.target.value) 
    }
    const [price, setPrice] = useState("");
    const checkprice = (e) => {
        setPrice(e.target.value) 
    }

    const addProduct = async () => {
        const data = {
            prod_name : name,
	        expire_date : date,
	        discription : description,
	        Category : category,
	        StartPrice : price,
        }
        console.log(data);
        const url = "http://localhost:8080/putProducts";
        await axios.put(url, data);
        
    }

    return(
        <div>
            <h1>seller</h1>
            <input type="text" onChange={checkname} value={name} placeholder="product name" />
            <input type="text" onChange={checkdate} value={date} placeholder="expiry date yyyy-mm-dd"/>
            <input type="text" onChange={checkdisc} value={description} placeholder="description" />
            <input type="text" onChange={checkcate} value={category} placeholder="category" />
            <input type="text" onChange={checkprice} value={price} placeholder="start price" />
            <input type="button" value="Submit" onClick={addProduct} />
        </div>
    );
}