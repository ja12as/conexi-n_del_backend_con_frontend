import React, { useEffect, useState } from 'react'
import query from '../api/axiosFile.js'

const AutorList = () => {
  const [autor, setAutor] = useState([])
  useEffect(()=>{
    query.get('/autor/listar')
    .then(resp => resp.data)
    .then(autor => setAutor(autor))
    .catch(err => console.log(err))
  },[])
  return (
    <div>
      <table className="table">
      <thead>
        <tr>
          <th scope="col">Id</th>
          <th scope="col">Autor</th>
        </tr>
      </thead>
      <tbody>
       
        {(autor.length === 0)?(
          <tr>
              <td>
                No hay usuario
              </td>
          </tr>
        ):(autor.map((autor)=>(
        <tr key={autor.id}>
          <th scope="row">{autor.id}</th>
          <td>{autor.email}</td>
          <td>{autor.password}</td>
        </tr>
        )))}
      </tbody>
    </table>
    </div>
  )
}

export default AutorList