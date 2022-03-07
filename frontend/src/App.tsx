import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { List } from 'pages/List';
import { Form } from 'pages/Form';
import { NavBar } from 'components/NavBar';

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
    </BrowserRouter>
  );
}

export default App;
