=begin
#BitMEX API

### REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 

OpenAPI spec version: 1.2.0
Contact: support@bitmex.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.38-SNAPSHOT

=end

require 'date'

module SwaggerClient
  class CollateralSupportAgreement
    attr_accessor :csa_id

    attr_accessor :account

    attr_accessor :currency

    attr_accessor :amount

    attr_accessor :min_amount

    attr_accessor :threshold

    attr_accessor :mm_ratio_margin_call

    attr_accessor :mm_ratio_liquidation

    attr_accessor :start_time

    attr_accessor :maturity_time

    attr_accessor :maturity_instruction

    attr_accessor :csa_status

    attr_accessor :requester

    attr_accessor :client_details

    attr_accessor :text

    attr_accessor :timestamp

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'csa_id' => :'csaID',
        :'account' => :'account',
        :'currency' => :'currency',
        :'amount' => :'amount',
        :'min_amount' => :'minAmount',
        :'threshold' => :'threshold',
        :'mm_ratio_margin_call' => :'mmRatioMarginCall',
        :'mm_ratio_liquidation' => :'mmRatioLiquidation',
        :'start_time' => :'startTime',
        :'maturity_time' => :'maturityTime',
        :'maturity_instruction' => :'maturityInstruction',
        :'csa_status' => :'csaStatus',
        :'requester' => :'requester',
        :'client_details' => :'clientDetails',
        :'text' => :'text',
        :'timestamp' => :'timestamp'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'csa_id' => :'String',
        :'account' => :'Float',
        :'currency' => :'String',
        :'amount' => :'Float',
        :'min_amount' => :'Float',
        :'threshold' => :'Float',
        :'mm_ratio_margin_call' => :'Float',
        :'mm_ratio_liquidation' => :'Float',
        :'start_time' => :'String',
        :'maturity_time' => :'String',
        :'maturity_instruction' => :'String',
        :'csa_status' => :'String',
        :'requester' => :'String',
        :'client_details' => :'String',
        :'text' => :'String',
        :'timestamp' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'csaID')
        self.csa_id = attributes[:'csaID']
      end

      if attributes.has_key?(:'account')
        self.account = attributes[:'account']
      end

      if attributes.has_key?(:'currency')
        self.currency = attributes[:'currency']
      end

      if attributes.has_key?(:'amount')
        self.amount = attributes[:'amount']
      end

      if attributes.has_key?(:'minAmount')
        self.min_amount = attributes[:'minAmount']
      end

      if attributes.has_key?(:'threshold')
        self.threshold = attributes[:'threshold']
      end

      if attributes.has_key?(:'mmRatioMarginCall')
        self.mm_ratio_margin_call = attributes[:'mmRatioMarginCall']
      end

      if attributes.has_key?(:'mmRatioLiquidation')
        self.mm_ratio_liquidation = attributes[:'mmRatioLiquidation']
      end

      if attributes.has_key?(:'startTime')
        self.start_time = attributes[:'startTime']
      end

      if attributes.has_key?(:'maturityTime')
        self.maturity_time = attributes[:'maturityTime']
      end

      if attributes.has_key?(:'maturityInstruction')
        self.maturity_instruction = attributes[:'maturityInstruction']
      end

      if attributes.has_key?(:'csaStatus')
        self.csa_status = attributes[:'csaStatus']
      end

      if attributes.has_key?(:'requester')
        self.requester = attributes[:'requester']
      end

      if attributes.has_key?(:'clientDetails')
        self.client_details = attributes[:'clientDetails']
      end

      if attributes.has_key?(:'text')
        self.text = attributes[:'text']
      end

      if attributes.has_key?(:'timestamp')
        self.timestamp = attributes[:'timestamp']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @csa_id.nil?
        invalid_properties.push('invalid value for "csa_id", csa_id cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @csa_id.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          csa_id == o.csa_id &&
          account == o.account &&
          currency == o.currency &&
          amount == o.amount &&
          min_amount == o.min_amount &&
          threshold == o.threshold &&
          mm_ratio_margin_call == o.mm_ratio_margin_call &&
          mm_ratio_liquidation == o.mm_ratio_liquidation &&
          start_time == o.start_time &&
          maturity_time == o.maturity_time &&
          maturity_instruction == o.maturity_instruction &&
          csa_status == o.csa_status &&
          requester == o.requester &&
          client_details == o.client_details &&
          text == o.text &&
          timestamp == o.timestamp
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [csa_id, account, currency, amount, min_amount, threshold, mm_ratio_margin_call, mm_ratio_liquidation, start_time, maturity_time, maturity_instruction, csa_status, requester, client_details, text, timestamp].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end
end