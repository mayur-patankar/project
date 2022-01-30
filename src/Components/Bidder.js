import axios from "axios";
import { useState } from "react/cjs/react.development";
const something = null;
export function Bidder()
{
    const [prodlist, setPList] = useState([]);
    const [bidlist, setBidlist] = useState([]);
        
    const getProducts = async () => {
        const url = "http://localhost:8080/getProduct";
        const result = await axios.get(url);
        console.log(result.data);
        setPList(result.data);
        something = result.data;
    }

    const [bidvalue, setBidvalue] =useState("");
    const bidchange = (e) => {
        setBidvalue(e.target.value);
    }
    const putBidd = async () => {
        const user = sessionStorage.getItem("user");
        const id = user.u_id;
        const url = "http://localhost:8080/postBidd";
        const data = {
            bidvalue: bidvalue,
            pid : pid,
            uid : "2",
        }
        console.log(data);
    }

    const [pid, setPid] = useState("");
    const prodsetter = (e) => {
        setPid(e.target.value);
    }
    const getBidds = async () => {
        const url = "http://localhost:8080/getBidds";
        const data = {
            pro_id : pid,
        }
        const result = await axios.get(url, data);
        setBidlist(result.data);
    };
    

    return(
        <div>
            <h1>bidder</h1>
            <input type="button" value="get products " onClick={getProducts}/>

            {prodlist.map((item, index) => (
            <div key={index}>
            {item.id} {item.prod_name} {item.expire_date} {item.discription} {item.category} {item.startPrice}
            <input type="button" value="get bids" onClick={getBidds()}/>
            <input type="radio" value={item.id} onClick={prodsetter}/>
                {bidlist.map((item, index) => (
                    <div key={index} className="alert border border-secondary fs-4">
                        {item.bidvalue}
                    </div>
                ))}        
            <input type="text" value={bidvalue} placeholder="enter bid u want to place" onChange={bidchange}/>
            <input type="button" value="submit bidd" onClick={putBidd}/>
            
            </div>
            ))}

        </div>
    );
}