import { FaCheck, FaTimes } from 'react-icons/fa';
import { Link } from 'react-router-dom';
import './styles.css';

const Form: React.FC = () => {
  const movie = {
    id: 1,
    image:
      'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg',
    title: 'The Witcher',
    count: 2,
    score: 4.5
  };

  return (
    <div className='dsmovie-form-container'>
      <img
        className='dsmovie-movie-form-image'
        src={movie.image}
        alt={movie.title}
      />
      <div className='dsmovie-form-bottom-container'>
        <form className='dsmovie-form'>
          <h3>{movie.title}</h3>
          <div className='form-group dsmovie-form-group'>
            <label htmlFor='email'>Informe seu email</label>
            <input
              type='email'
              className='form-control'
              id='email'
              placeholder='email@email.com'
            />
          </div>

          <div className='form-group dsmovie-form-group'>
            <label htmlFor='score'>Informe sua avaliação</label>
            <select
              className='form-select dsmovie-form-group'
              aria-label='Default select example'
            >
              <option value='1'>1</option>
              <option value='2'>2</option>
              <option value='3'>3</option>
            </select>
          </div>
          <div className='d-grid gap-2 d-flex dsmovie-form-btn-container'>
            <button className='btn btn-success dsmovie-form-btn' type='button'>
              Salvar <FaCheck />
            </button>
            <Link to={'/'}>
              <button className='btn btn-danger dsmovie-form-btn' type='button'>
                Cancelar <FaTimes />
              </button>
            </Link>
          </div>
        </form>
      </div>
    </div>
  );
};

export { Form };
