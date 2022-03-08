// import { FaGithub } from 'react-icons/fa';
import { Link } from 'react-router-dom';
import { ReactComponent as GitHubIcon } from '../../assets/img/github.svg';
import './styles.css';
const NavBar: React.FC = () => {
  return (
    <header>
      <nav className='container'>
        <div className='dsmovie-nav-content'>
          <Link to={'/'}>
            <h1>DSMovie</h1>
          </Link>
          <a
            href='https://github.com/devsuperior'
            target='_blank'
            rel='noreferrer'
          >
            <div className='dsmovie-contact-container'>
              <GitHubIcon />
              <p className='dsmovie-contact-link'>/devsuperior</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
};

export { NavBar };
