import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { ToastContainer } from 'react-toastify';
import { List } from 'pages/List';
import { Form } from 'pages/Form';
import { NavBar } from 'components/NavBar';

import 'react-toastify/dist/ReactToastify.css';

function App() {
  return (
    <BrowserRouter>
      <NavBar />
      <Routes>
        <Route path='/' element={<List />} />
        <Route path='/form'>
          <Route path=':movieId' element={<Form />} />
        </Route>
      </Routes>
      <ToastContainer autoClose={3000} />
    </BrowserRouter>
  );
}

export default App;
