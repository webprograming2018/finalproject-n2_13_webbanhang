<%-- 
    Document   : paypal_test
    Created on : Nov 14, 2018, 11:41:41 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <!-- Render the radio fields and button containers -->

<label>
  <input type="radio" name="payment-option" value="paypal" checked>
  <img src="/demo/checkout/static/img/paypal-mark.jpg" alt="Pay with Paypal">
</label>

<label>
  <input type="radio" name="payment-option" value="card">
  <img src="/demo/checkout/static/img/card-mark.png"
     alt="Accepting Visa, Mastercard, Discover and American Express">
</label>

<div id="paypal-button-container"></div>
<div id="card-button-container" class="hidden"><button>Continue</button></div>

<script>
  // Helper functions

  function getElements(el) {
    return Array.prototype.slice.call(document.querySelectorAll(el));
  }

  function hideElement(el) {
    document.body.querySelector(el).style.display = 'none';
  }

  function showElement(el) {
    document.body.querySelector(el).style.display = 'block';
  }

  // Listen for changes to the radio fields
  getElements('input[name=payment-option]').forEach(function (el) {
    el.addEventListener('change', function (event) {
      // If PayPal is selected, show the PayPal button
      if (event.target.value === 'paypal') {
        hideElement('#card-button-container');
        showElement('#paypal-button-container');
      }

      // If Card is selected, show the standard continue button
      if (event.target.value === 'card') {
        showElement('#card-button-container');
        hideElement('#paypal-button-container');
      }
    });
  });

  // Hide non-PayPal button by default
  hideElement('#card-button-container');

  // Render the PayPal button
  paypal.Button.render({
    env: 'production', // Optional: specify 'sandbox' environment
    client: {
      sandbox:    'xxxxxxxxx',
      production: 'xxxxxxxxx'
    },
    payment: function (data, actions) {
      return actions.payment.create({
        payment: {
          transactions: [
            {
              amount: {
                total: '1.00',
                currency: 'USD'
              }
            }
          ]
        }
      });
    },
    onAuthorize: function (data, actions) {
      return actions.payment.execute()
        .then(function () {
          document.querySelector('#paypal-button-container')
            .innerText = 'Payment Complete!';
        });
    }
  }, '#paypal-button-container');

</script>
    </body>
</html>
