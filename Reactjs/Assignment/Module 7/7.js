// actions/authActions.js
import axios from 'axios';

export const login = (credentials) => {
  return (dispatch) => {
    return axios.post('/api/login', credentials)
      .then(response => {
        dispatch({ type: 'LOGIN_SUCCESS', payload: response.data });
      })
      .catch(error => {
        dispatch({ type: 'LOGIN_ERROR', payload: error.message });
      });
  };
};

export const register = (userData) => {
  return (dispatch) => {
    return axios.post('/api/register', userData)
      .then(response => {
        dispatch({ type: 'REGISTER_SUCCESS', payload: response.data });
      })
      .catch(error => {
        dispatch({ type: 'REGISTER_ERROR', payload: error.message });
      });
  };
};

// reducers/authReducer.js
const initialState = {
  user: null,
  error: null
};

const authReducer = (state = initialState, action) => {
  switch (action.type) {
    case 'LOGIN_SUCCESS':
      return {
        ...state,
        user: action.payload,
        error: null
      };
    case 'LOGIN_ERROR':
      return {
        ...state,
        user: null,
        error: action.payload
      };
    case 'REGISTER_SUCCESS':
      return {
        ...state,
        user: action.payload,
        error: null
      };
    case 'REGISTER_ERROR':
      return {
        ...state,
        user: null,
        error: action.payload
      };
    default:
      return state;
  }
};

export default authReducer;
