const webpack = require('webpack');
const path = require('path');

module.exports = {
  context: path.resolve(__dirname, 'front'),
  entry: {
    home: './home.js',
  },
  output: {
    path: path.resolve(__dirname, 'webapp/resources'),
    filename: '[name].js',
    publicPath: '/example/resources',
  }
};
