package iobp.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.16.
 */
@SuppressWarnings("rawtypes")
public class ContractCollaborationManager extends Contract {
    public static final String BINARY = "6080604052600019600c5534801561001657600080fd5b506040516115553803806115558339818101604052604081101561003957600080fd5b508051602091820151600080546001600160a01b031990811633178255600980546001600160a01b03958616908316179055600a8054949093169316929092179055600c54600b8190556001829055600882905581805260079092527f6d5257204ebe7d88fd91ae87941cb2dd9d8062b64ae5a2bd2d28ec40b9fbf6df557f6d5257204ebe7d88fd91ae87941cb2dd9d8062b64ae5a2bd2d28ec40b9fbf6e05561146d806100e86000396000f3fe608060405234801561001057600080fd5b50600436106101005760003560e01c80638e5cb5f611610097578063b60196aa11610066578063b60196aa146105a7578063b9f4e169146106e7578063c17a340e1461070a578063ffad0fc61461071257610100565b80638e5cb5f61461047b578063976217cd14610498578063a242592714610597578063a401e16a1461059f57610100565b806350586b81116100d357806350586b811461024a57806367503652146102ef5780637e0186f61461043a5780638ba223d01461045757610100565b806304a87e38146101055780631457ffd61461015d578063251c05131461021357806333251a3a1461022d575b600080fd5b61010d61071a565b60408051602080825283518183015283519192839290830191858101910280838360005b83811015610149578181015183820152602001610131565b505050509050019250505060405180910390f35b6102116004803603604081101561017357600080fd5b6001600160a01b038235169190810190604081016020820135600160201b81111561019d57600080fd5b8201836020820111156101af57600080fd5b803590602001918460018302840111600160201b831117156101d057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550610772945050505050565b005b61021b61080e565b60408051918252519081900360200190f35b61021b6004803603602081101561024357600080fd5b5035610814565b6102676004803603602081101561026057600080fd5b5035610832565b60405180836001600160a01b0316815260200180602001828103825283818151815260200191508051906020019080838360005b838110156102b357818101518382015260200161029b565b50505050905090810190601f1680156102e05780820380516001836020036101000a031916815260200191505b50935050505060405180910390f35b610426600480360360a081101561030557600080fd5b813591602081013591810190606081016040820135600160201b81111561032b57600080fd5b82018360208201111561033d57600080fd5b803590602001918460018302840111600160201b8311171561035e57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b8111156103b057600080fd5b8201836020820111156103c257600080fd5b803590602001918460018302840111600160201b831117156103e357600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955050913592506108ef915050565b604080519115158252519081900360200190f35b61021b6004803603602081101561045057600080fd5b503561108f565b61045f61109c565b604080516001600160a01b039092168252519081900360200190f35b61021b6004803603602081101561049157600080fd5b50356110ab565b6104b5600480360360208110156104ae57600080fd5b50356110c0565b6040518080602001866001600160a01b031681526020018560058111156104d857fe5b815260200180602001848152602001838103835288818151815260200191508051906020019080838360005b8381101561051c578181015183820152602001610504565b50505050905090810190601f1680156105495780820380516001836020036101000a031916815260200191505b508381038252855181528551602091820191808801910280838360005b8381101561057e578181015183820152602001610566565b5050505090500197505050505050505060405180910390f35b61021b6111ef565b61021b6111f5565b610211600480360360a08110156105bd57600080fd5b810190602081018135600160201b8111156105d757600080fd5b8201836020820111156105e957600080fd5b803590602001918460018302840111600160201b8311171561060a57600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092956001600160a01b038535169560ff60208701351695919450925060608101915060400135600160201b81111561067457600080fd5b82018360208201111561068657600080fd5b803590602001918460208302840111600160201b831117156106a757600080fd5b91908080602002602001604051908101604052809392919081815260200183836020028082843760009201919091525092955050913592506111fb915050565b610426600480360360408110156106fd57600080fd5b50803590602001356112d2565b61021b61130e565b61010d611314565b6060600480548060200260200160405190810160405280929190818152602001828054801561076857602002820191906000526020600020905b815481526020019060010190808311610754575b5050505050905090565b6000546001600160a01b0316331461078957600080fd5b600280546001808201909255600090815260056020908152604090912080546001600160a01b0319166001600160a01b038616178155835190926107d492908401919085019061136a565b5050600680546001810182556000919091527ff652222313e28459528d920b65115c16c04f3efc82aaedc97be59f3f377c0d3f8101555050565b60085490565b6004818154811061082157fe5b600091825260209091200154905081565b60008181526005602090815260408083208054600191820180548451600261010095831615959095026000190190911693909304601f81018690048602840186019094528383526060946001600160a01b03909216939092918391908301828280156108df5780601f106108b4576101008083540402835291602001916108df565b820191906000526020600020905b8154815290600101906020018083116108c257829003601f168201915b5050505050905091509150915091565b6000848152600360205260408120546001600160a01b0316331461091257600080fd5b600460008681526003602052604090206002015460ff16600581111561093457fe5b14156109fe576008805460019081019091556000878152600760205260408120888155600c549201919091555b6001548110156109975760008781526007602090815260408083208484526002019091529020805460ff19169055600101610961565b50600a54604080516305b0be9960e51b81526004810189905290516001600160a01b039092169163b617d3209160248082019260009290919082900301818387803b1580156109e557600080fd5b505af11580156109f9573d6000803e3d6000fd5b505050505b600085815260036020819052604082206002810154839283920190829060ff166005811115610a2957fe5b1480610a545750600460008a81526003602052604090206002015460ff166005811115610a5257fe5b145b80610a7e5750600560008a81526003602052604090206002015460ff166005811115610a7c57fe5b145b15610ca857610aa48a82600081548110610a9457fe5b90600052602060002001546112d2565b8015610aed5750600b5460008a8152600360205260409020600401541480610aed57506000898152600360209081526040808320600401548d8452600790925290912060010154145b15610ca35760008a81526007602090815260408083208c845260029081018352818420805460ff1916600117905560039092528220015460ff166005811115610b3257fe5b1415610c9657600960009054906101000a90046001600160a01b03166001600160a01b031663547c83d58b8a8a333a6040518663ffffffff1660e01b8152600401808681526020018060200180602001856001600160a01b03168152602001848152602001838103835287818151815260200191508051906020019080838360005b83811015610bcc578181015183820152602001610bb4565b50505050905090810190601f168015610bf95780820380516001836020036101000a031916815260200191505b50838103825286518152865160209182019188019080838360005b83811015610c2c578181015183820152602001610c14565b50505050905090810190601f168015610c595780820380516001836020036101000a031916815260200191505b50975050505050505050600060405180830381600087803b158015610c7d57600080fd5b505af1158015610c91573d6000803e3d6000fd5b505050505b6001945050505050611086565b61107d565b600160008a81526003602052604090206002015460ff166005811115610cca57fe5b1415610d8d57600091505b8054821015610d0557610cee8a828481548110610a9457fe5b15610cfa576001909301925b600190910190610cd5565b805484148015610d525750600b5460008a8152600360205260409020600401541480610d5257506000898152600360209081526040808320600401548d8452600790925290912060010154145b15610ca35750505060008781526007602090815260408083208984526002019091529020805460ff1916600190811790915591506110869050565b600260008a81526003602052604090206002015460ff166005811115610daf57fe5b1415610e7157600092505b8054831015610dea57610dd38a828581548110610a9457fe5b15610ddf576001909301925b600190920191610dba565b600084118015610d525750600b5460008a8152600360205260409020600401541480610d5257506000898152600360209081526040808320600401548d84526007909252909120600101541415610ca35750505060008781526007602090815260408083208984526002019091529020805460ff1916600190811790915591506110869050565b600360008a81526003602052604090206002015460ff166005811115610e9357fe5b141561107d5760008093505b8154841015610f5e57610eb88b838681548110610a9457fe5b15610f5357600190940193600060036000848781548110610ed557fe5b6000918252602080832090910154835282019290925260400190206002015460ff166005811115610f0257fe5b1480610f4a5750600460036000848781548110610f1b57fe5b6000918252602080832090910154835282019290925260400190206002015460ff166005811115610f4857fe5b145b15610f53575060015b600190930192610e9f565b815460011015610fe55760018510158015610fa4575060008b8152600760209081526040808320600101548d84526003909252909120600401541480610fa45750806001145b15610fe05750505060008881526007602090815260408083208a84526002019091529020805460ff191660019081179091559250611086915050565b61107b565b8460011480156110325750600b5460008b8152600360205260409020600401541480611032575060008a8152600360209081526040808320600401548e8452600790925290912060010154145b1561107b5750505060008881526007602081815260408084208b8552600281018352908420805460ff19166001908117909155938c905291905281018590559250611086915050565b505b60009450505050505b95945050505050565b6006818154811061082157fe5b6000546001600160a01b031690565b60009081526007602052604090206001015490565b6000818152600360208181526040808420805460028083015460048401546001808601805488516101009382161593909302600019011694909404601f81018990048902820189019097528681526060999889988b988a9896976001600160a01b03169660ff9096169590920193929187918301828280156111835780601f1061115857610100808354040283529160200191611183565b820191906000526020600020905b81548152906001019060200180831161116657829003601f168201915b50505050509450818054806020026020016040519081016040528092919081815260200182805480156111d557602002820191906000526020600020905b8154815260200190600101908083116111c1575b505050505091509450945094509450945091939590929450565b60025490565b600b5490565b6000546001600160a01b0316331461121257600080fd5b600180548082018255600090815260036020908152604090912080546001600160a01b0319166001600160a01b0388161781558751909261125a92908401919089019061136a565b5060028101805485919060ff1916600183600581111561127657fe5b0217905550825161129090600383019060208601906113e8565b5060049081019190915580546001810182556000919091527f8a35acfbc15ff81a39ae7d344fd709f28e8600b4aa8c65c6b64bfe7fe36bd19b81015550505050565b6000600c548214156112e657506001611308565b50600082815260076020908152604080832084845260020190915290205460ff165b92915050565b60015490565b606060068054806020026020016040519081016040528092919081815260200182805480156107685760200282019190600052602060002090815481526020019060010190808311610754575050505050905090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106113ab57805160ff19168380011785556113d8565b828001600101855582156113d8579182015b828111156113d85782518255916020019190600101906113bd565b506113e4929150611422565b5090565b8280548282559060005260206000209081019282156113d857916020028201828111156113d85782518255916020019190600101906113bd565b5b808211156113e4576000815560010161142356fea264697066735822122067471987428deb8423f78f823461f8587285060ad14a0e50703bab0766cc059664736f6c63430007000033";

    public static final String FUNC_ADDCOLLABORATOR = "addCollaborator";

    public static final String FUNC_COLLABORATORARRAY = "collaboratorArray";

    public static final String FUNC_CREATETASK = "createTask";

    public static final String FUNC_GETCOLLABORATORBYID = "getCollaboratorById";

    public static final String FUNC_GETCOLLABORATORCOUNT = "getCollaboratorCount";

    public static final String FUNC_GETCOLLABORATORS = "getCollaborators";

    public static final String FUNC_GETNOCONDITIONVALUE = "getNoConditionValue";

    public static final String FUNC_GETSUPERVISOR = "getSupervisor";

    public static final String FUNC_GETTASKBYID = "getTaskById";

    public static final String FUNC_GETTASKCOUNT = "getTaskCount";

    public static final String FUNC_GETTASKS = "getTasks";

    public static final String FUNC_GETTRACECOUNT = "getTraceCount";

    public static final String FUNC_GETX = "getX";

    public static final String FUNC_ISTASKCOMPLETEDBYID = "isTaskCompletedById";

    public static final String FUNC_SETTASKONCOMPLETED = "setTaskOnCompleted";

    public static final String FUNC_TASKSARRAY = "tasksArray";

    @Deprecated
    protected ContractCollaborationManager(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ContractCollaborationManager(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ContractCollaborationManager(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ContractCollaborationManager(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> addCollaborator(String _collaborator, String _organisation) {
        final Function function = new Function(
                FUNC_ADDCOLLABORATOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _collaborator), 
                new org.web3j.abi.datatypes.Utf8String(_organisation)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> collaboratorArray(BigInteger param0) {
        final Function function = new Function(FUNC_COLLABORATORARRAY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> createTask(String _activity, String _executor, BigInteger _tasktype, List<BigInteger> _requirements, BigInteger condition) {
        final Function function = new Function(
                FUNC_CREATETASK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_activity), 
                new org.web3j.abi.datatypes.Address(160, _executor), 
                new org.web3j.abi.datatypes.generated.Uint8(_tasktype), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(_requirements, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.Uint256(condition)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple2<String, String>> getCollaboratorById(BigInteger _id) {
        final Function function = new Function(FUNC_GETCOLLABORATORBYID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteFunctionCall<Tuple2<String, String>>(function,
                new Callable<Tuple2<String, String>>() {
                    @Override
                    public Tuple2<String, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, String>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> getCollaboratorCount() {
        final Function function = new Function(FUNC_GETCOLLABORATORCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<List> getCollaborators() {
        final Function function = new Function(FUNC_GETCOLLABORATORS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> getNoConditionValue() {
        final Function function = new Function(FUNC_GETNOCONDITIONVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> getSupervisor() {
        final Function function = new Function(FUNC_GETSUPERVISOR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple5<String, String, BigInteger, List<BigInteger>, BigInteger>> getTaskById(BigInteger _id) {
        final Function function = new Function(FUNC_GETTASKBYID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Address>() {}, new TypeReference<Uint8>() {}, new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple5<String, String, BigInteger, List<BigInteger>, BigInteger>>(function,
                new Callable<Tuple5<String, String, BigInteger, List<BigInteger>, BigInteger>>() {
                    @Override
                    public Tuple5<String, String, BigInteger, List<BigInteger>, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<String, String, BigInteger, List<BigInteger>, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                convertToNative((List<Uint256>) results.get(3).getValue()), 
                                (BigInteger) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> getTaskCount() {
        final Function function = new Function(FUNC_GETTASKCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<List> getTasks() {
        final Function function = new Function(FUNC_GETTASKS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> getTraceCount() {
        final Function function = new Function(FUNC_GETTRACECOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getX(BigInteger _caseid) {
        final Function function = new Function(FUNC_GETX, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_caseid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Boolean> isTaskCompletedById(BigInteger _caseid, BigInteger _taskid) {
        final Function function = new Function(FUNC_ISTASKCOMPLETEDBYID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_caseid), 
                new org.web3j.abi.datatypes.generated.Uint256(_taskid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setTaskOnCompleted(BigInteger _caseid, BigInteger _taskId, String _taskName, String _timestamp, BigInteger _token) {
        final Function function = new Function(
                FUNC_SETTASKONCOMPLETED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_caseid), 
                new org.web3j.abi.datatypes.generated.Uint256(_taskId), 
                new org.web3j.abi.datatypes.Utf8String(_taskName), 
                new org.web3j.abi.datatypes.Utf8String(_timestamp), 
                new org.web3j.abi.datatypes.generated.Uint256(_token)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> tasksArray(BigInteger param0) {
        final Function function = new Function(FUNC_TASKSARRAY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static ContractCollaborationManager load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ContractCollaborationManager(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ContractCollaborationManager load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ContractCollaborationManager(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ContractCollaborationManager load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ContractCollaborationManager(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractCollaborationManager load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ContractCollaborationManager(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ContractCollaborationManager> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String eventlogCleanerContractAddress, String eventLogContractAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, eventlogCleanerContractAddress), 
                new org.web3j.abi.datatypes.Address(160, eventLogContractAddress)));
        return deployRemoteCall(ContractCollaborationManager.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<ContractCollaborationManager> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String eventlogCleanerContractAddress, String eventLogContractAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, eventlogCleanerContractAddress), 
                new org.web3j.abi.datatypes.Address(160, eventLogContractAddress)));
        return deployRemoteCall(ContractCollaborationManager.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<ContractCollaborationManager> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String eventlogCleanerContractAddress, String eventLogContractAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, eventlogCleanerContractAddress), 
                new org.web3j.abi.datatypes.Address(160, eventLogContractAddress)));
        return deployRemoteCall(ContractCollaborationManager.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<ContractCollaborationManager> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String eventlogCleanerContractAddress, String eventLogContractAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, eventlogCleanerContractAddress), 
                new org.web3j.abi.datatypes.Address(160, eventLogContractAddress)));
        return deployRemoteCall(ContractCollaborationManager.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
