import { FaCheck, FaTimes } from 'react-icons/fa';
import { Link, useNavigate } from 'react-router-dom';
import { TypeMovie } from 'app/types/TypeMovie';
import './styles.css';
import { useEffect, useState } from 'react';
import { api } from 'app/http';
import { BASE_URL_API } from 'app/utils/constants';
import { validateEmail } from 'app/utils/validate';
import { toast } from 'react-toastify';
import { AxiosRequestConfig } from 'axios';

type FormCardProps = {
  movieId: string;
};

const FormCard: React.FC<FormCardProps> = ({ movieId }) => {
  const navigate = useNavigate();
  const [movie, setMovie] = useState<TypeMovie>();

  useEffect(() => {
    api.get(`${BASE_URL_API}/movies/${movieId}`).then(resp => {
      setMovie(resp.data);
    });
  }, [movieId]);

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    const email = (e.target as any).email.value;
    const score = (e.target as any).score.value;
    if (!validateEmail(email)) {
      toast.error('Email inválido');
      return;
    }

    const config: AxiosRequestConfig = {
      baseURL: BASE_URL_API,
      method: 'PUT',
      url: `/scores/${movieId}`,
      data: {
        movieId: movieId,
        email: email,
        score: score
      }
    };

    api(config).then(resp => {
      toast.success('Score atualizado com sucesso!');
      navigate('/');
    });
  };

  return (
    <div className='dsmovie-form-container'>
      <img
        className='dsmovie-movie-form-image'
        src={movie?.image}
        alt={movie?.title}
      />
      <div className='dsmovie-form-bottom-container'>
        <form className='dsmovie-form' onSubmit={handleSubmit}>
          <h3>{movie?.title}</h3>
          <div className='form-group dsmovie-form-group'>
            <label htmlFor='email'>Informe seu email</label>
            <input
              type='text'
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
              id={'score'}
            >
              <option value='1'>1</option>
              <option value='2'>2</option>
              <option value='3'>3</option>
              <option value='4'>4</option>
              <option value='5'>5</option>
            </select>
          </div>
          <div className='d-grid gap-2 d-flex dsmovie-form-btn-container'>
            <button className='btn btn-success dsmovie-form-btn' type='submit'>
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

export { FormCard };
