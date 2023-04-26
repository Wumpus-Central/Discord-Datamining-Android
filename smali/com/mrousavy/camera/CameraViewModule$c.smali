.class final Lcom/mrousavy/camera/CameraViewModule$c;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrousavy/camera/CameraViewModule;->getAvailableCameraDevices(Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.mrousavy.camera.CameraViewModule$getAvailableCameraDevices$1"
    f = "CameraViewModule.kt"
    l = {
        0xaf,
        0xb0,
        0xb1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field k:Ljava/lang/Object;

.field l:Ljava/lang/Object;

.field m:Ljava/lang/Object;

.field n:Ljava/lang/Object;

.field o:J

.field p:I

.field final synthetic q:Lcom/facebook/react/bridge/Promise;

.field final synthetic r:Lcom/mrousavy/camera/CameraViewModule;

.field final synthetic s:J


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/Promise;Lcom/mrousavy/camera/CameraViewModule;JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/Promise;",
            "Lcom/mrousavy/camera/CameraViewModule;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/mrousavy/camera/CameraViewModule$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mrousavy/camera/CameraViewModule$c;->q:Lcom/facebook/react/bridge/Promise;

    iput-object p2, p0, Lcom/mrousavy/camera/CameraViewModule$c;->r:Lcom/mrousavy/camera/CameraViewModule;

    iput-wide p3, p0, Lcom/mrousavy/camera/CameraViewModule$c;->s:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/mrousavy/camera/CameraViewModule$c;

    iget-object v1, p0, Lcom/mrousavy/camera/CameraViewModule$c;->q:Lcom/facebook/react/bridge/Promise;

    iget-object v2, p0, Lcom/mrousavy/camera/CameraViewModule$c;->r:Lcom/mrousavy/camera/CameraViewModule;

    iget-wide v3, p0, Lcom/mrousavy/camera/CameraViewModule$c;->s:J

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/mrousavy/camera/CameraViewModule$c;-><init>(Lcom/facebook/react/bridge/Promise;Lcom/mrousavy/camera/CameraViewModule;JLkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/CameraViewModule$c;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/CameraViewModule$c;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/mrousavy/camera/CameraViewModule$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/mrousavy/camera/CameraViewModule$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 51

    move-object/from16 v1, p0

    const-string v0, "cameraConfig.outputFormats"

    const-string v2, "id"

    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->p:I

    const-string v5, "getInstance(reactApplicationContext)"

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v8, :cond_2

    if-eq v4, v7, :cond_1

    if-ne v4, v6, :cond_0

    iget-wide v3, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    iget-object v5, v1, Lcom/mrousavy/camera/CameraViewModule$c;->n:Ljava/lang/Object;

    check-cast v5, Landroidx/camera/lifecycle/e;

    iget-object v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->m:Ljava/lang/Object;

    check-cast v9, Landroidx/camera/extensions/ExtensionsManager;

    iget-object v10, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    check-cast v10, Lcom/mrousavy/camera/CameraViewModule;

    iget-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    check-cast v11, Lcom/facebook/react/bridge/Promise;

    :try_start_0
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    iget-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->m:Ljava/lang/Object;

    check-cast v4, Landroidx/camera/lifecycle/e;

    iget-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    check-cast v11, Lcom/mrousavy/camera/CameraViewModule;

    iget-object v12, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    check-cast v12, Lcom/facebook/react/bridge/Promise;

    :try_start_1
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v13, p1

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v11, v12

    goto/16 :goto_27

    :cond_2
    iget-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    iget-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    check-cast v4, Lcom/mrousavy/camera/CameraViewModule;

    iget-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    check-cast v11, Lcom/facebook/react/bridge/Promise;

    :try_start_2
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    move-object/from16 v12, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->q:Lcom/facebook/react/bridge/Promise;

    iget-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->r:Lcom/mrousavy/camera/CameraViewModule;

    iget-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->s:J

    .line 3
    :try_start_3
    invoke-static {v4}, Lcom/mrousavy/camera/CameraViewModule;->access$getReactApplicationContext(Lcom/mrousavy/camera/CameraViewModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v12

    invoke-static {v12}, Landroidx/camera/lifecycle/e;->g(Landroid/content/Context;)Lfc/b;

    move-result-object v12

    invoke-static {v12, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    iput-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    iput-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    iput v8, v1, Lcom/mrousavy/camera/CameraViewModule$c;->p:I

    invoke-static {v12, v1}, Lui/a;->b(Lfc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_4

    return-object v3

    .line 4
    :cond_4
    :goto_0
    check-cast v12, Landroidx/camera/lifecycle/e;

    .line 5
    invoke-static {v4}, Lcom/mrousavy/camera/CameraViewModule;->access$getReactApplicationContext(Lcom/mrousavy/camera/CameraViewModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v13

    invoke-static {v13, v12}, Landroidx/camera/extensions/ExtensionsManager;->c(Landroid/content/Context;Landroidx/camera/core/s;)Lfc/b;

    move-result-object v13

    const-string v14, "getInstanceAsync(reactAp\u2026nContext, cameraProvider)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    iput-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    iput-object v12, v1, Lcom/mrousavy/camera/CameraViewModule$c;->m:Ljava/lang/Object;

    iput-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    iput v7, v1, Lcom/mrousavy/camera/CameraViewModule$c;->p:I

    invoke-static {v13, v1}, Lui/a;->b(Lfc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-ne v13, v3, :cond_5

    return-object v3

    :cond_5
    move-object/from16 v50, v11

    move-object v11, v4

    move-object v4, v12

    move-object/from16 v12, v50

    .line 6
    :goto_1
    :try_start_4
    check-cast v13, Landroidx/camera/extensions/ExtensionsManager;

    .line 7
    invoke-static {v11}, Lcom/mrousavy/camera/CameraViewModule;->access$getReactApplicationContext(Lcom/mrousavy/camera/CameraViewModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v14

    invoke-static {v14}, Landroidx/camera/lifecycle/e;->g(Landroid/content/Context;)Lfc/b;

    move-result-object v14

    invoke-static {v14, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    iput-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    iput-object v13, v1, Lcom/mrousavy/camera/CameraViewModule$c;->m:Ljava/lang/Object;

    iput-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->n:Ljava/lang/Object;

    iput-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    iput v6, v1, Lcom/mrousavy/camera/CameraViewModule$c;->p:I

    invoke-static {v14, v1}, Lui/a;->b(Lfc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne v5, v3, :cond_6

    return-object v3

    :cond_6
    move-object v5, v4

    move-wide v3, v9

    move-object v10, v11

    move-object v11, v12

    move-object v9, v13

    .line 8
    :goto_2
    :try_start_5
    invoke-static {v10}, Lcom/mrousavy/camera/CameraViewModule;->access$getReactApplicationContext(Lcom/mrousavy/camera/CameraViewModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v10

    const-string v12, "camera"

    invoke-virtual {v10, v12}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v12, v10, Landroid/hardware/camera2/CameraManager;

    if-eqz v12, :cond_7

    check-cast v10, Landroid/hardware/camera2/CameraManager;

    goto :goto_3

    :cond_7
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_30

    .line 9
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v12

    const-string v14, "createArray()"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {v10}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v14

    const-string v15, "manager.cameraIdList"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    array-length v15, v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    const/4 v13, 0x0

    :goto_4
    const-string v8, "CameraView"

    if-ge v13, v15, :cond_2f

    :try_start_6
    aget-object v7, v14, v13

    .line 12
    new-instance v6, Landroidx/camera/core/t$a;

    invoke-direct {v6}, Landroidx/camera/core/t$a;-><init>()V

    invoke-static {v7, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v7}, Lse/e;->b(Landroidx/camera/core/t$a;Ljava/lang/String;)Landroidx/camera/core/t$a;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/camera/core/t$a;->b()Landroidx/camera/core/t;

    move-result-object v6

    const-string v1, "Builder().byID(id).build()"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v10, v7}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v1

    move-object/from16 v18, v10

    const-string v10, "manager.getCameraCharacteristics(id)"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget-object v10, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v10}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    move-object/from16 v19, v14

    .line 15
    sget-object v14, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v14}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast v14, [I

    move/from16 v20, v15

    .line 16
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object/from16 v21, v11

    const/16 v11, 0x1c

    if-lt v15, v11, :cond_8

    const/16 v11, 0xb

    .line 17
    :try_start_7
    invoke-static {v14, v11}, Lkotlin/collections/b;->w([II)Z

    move-result v11

    if-eqz v11, :cond_8

    move-wide/from16 v23, v3

    const/4 v11, 0x1

    goto :goto_5

    :cond_8
    move-wide/from16 v23, v3

    const/4 v11, 0x0

    .line 18
    :goto_5
    invoke-static {v1}, Lse/c;->a(Landroid/hardware/camera2/CameraCharacteristics;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v3

    .line 19
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast v4, Landroid/hardware/camera2/params/StreamConfigurationMap;

    move/from16 v25, v13

    .line 20
    sget-object v13, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v13}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v13

    move-object/from16 v26, v12

    .line 21
    sget-object v12, Landroid/hardware/camera2/CameraCharacteristics;->FLASH_INFO_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v12}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    move-object/from16 v27, v8

    .line 22
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_MAX_DIGITAL_ZOOM:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v8}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    move-object/from16 v28, v0

    const/16 v0, 0x8

    .line 23
    invoke-static {v14, v0}, Lkotlin/collections/b;->w([II)Z

    move-result v0

    move-object/from16 v29, v4

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    const/4 v4, 0x3

    .line 24
    invoke-static {v14, v4}, Lkotlin/collections/b;->w([II)Z

    move-result v14

    .line 25
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_SENSITIVITY_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Range;

    move-object/from16 v30, v4

    .line 26
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [I

    move-object/from16 v31, v4

    .line 27
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [I

    move-object/from16 v32, v4

    const/16 v4, 0x1e

    if-lt v15, v4, :cond_a

    .line 28
    invoke-static {}, Lq/a;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Range;

    goto :goto_7

    :cond_a
    const/4 v4, 0x0

    :goto_7
    move-object/from16 v33, v5

    const/16 v5, 0x1c

    if-lt v15, v5, :cond_b

    .line 29
    invoke-static {}, Lcom/mrousavy/camera/l;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_8

    :cond_b
    const/4 v5, 0x0

    .line 30
    :goto_8
    sget-object v15, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v15}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast v15, [Landroid/util/Range;

    move-object/from16 v22, v15

    const/4 v15, 0x2

    .line 31
    invoke-virtual {v9, v6, v15}, Landroidx/camera/extensions/ExtensionsManager;->f(Landroidx/camera/core/t;I)Z

    move-result v16

    const/4 v15, 0x3

    .line 32
    invoke-virtual {v9, v6, v15}, Landroidx/camera/extensions/ExtensionsManager;->f(Landroidx/camera/core/t;I)Z

    move-result v17

    const/4 v15, 0x2

    if-eq v10, v15, :cond_c

    if-eqz v10, :cond_c

    move/from16 v35, v8

    move-object/from16 v34, v9

    const/4 v10, 0x1

    goto :goto_9

    :cond_c
    move/from16 v35, v8

    move-object/from16 v34, v9

    const/4 v10, 0x0

    .line 33
    :goto_9
    invoke-static {v1}, Lse/c;->b(Landroid/hardware/camera2/CameraCharacteristics;)D

    move-result-wide v8

    .line 34
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    .line 35
    invoke-interface {v1, v2, v7}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "devices"

    .line 36
    invoke-interface {v1, v15, v3}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v3, "position"

    .line 37
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, Lre/b;->a(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v1, v3, v15}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "name"

    if-nez v5, :cond_d

    .line 38
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, Lre/b;->a(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, " ("

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x29

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_d
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "hasFlash"

    if-eqz v12, :cond_e

    const/4 v5, 0x1

    goto :goto_a

    :cond_e
    const/4 v5, 0x0

    .line 39
    :goto_a
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "hasTorch"

    if-eqz v12, :cond_f

    const/4 v5, 0x1

    goto :goto_b

    :cond_f
    const/4 v5, 0x0

    .line 40
    :goto_b
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "isMultiCam"

    if-eqz v11, :cond_10

    const/4 v5, 0x1

    goto :goto_c

    :cond_10
    const/4 v5, 0x0

    .line 41
    :goto_c
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "supportsParallelVideoProcessing"

    if-eqz v10, :cond_11

    const/4 v5, 0x1

    goto :goto_d

    :cond_11
    const/4 v5, 0x0

    .line 42
    :goto_d
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "supportsRawCapture"

    if-eqz v14, :cond_12

    const/4 v5, 0x1

    goto :goto_e

    :cond_12
    const/4 v5, 0x0

    .line 43
    :goto_e
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "supportsDepthCapture"

    if-eqz v0, :cond_13

    const/4 v0, 0x1

    goto :goto_f

    :cond_13
    const/4 v0, 0x0

    .line 44
    :goto_f
    invoke-interface {v1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "supportsLowLightBoost"

    if-eqz v17, :cond_14

    const/4 v3, 0x1

    goto :goto_10

    :cond_14
    const/4 v3, 0x0

    .line 45
    :goto_10
    invoke-interface {v1, v0, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "supportsFocus"

    const/4 v3, 0x1

    .line 46
    invoke-interface {v1, v0, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    const-string v0, "minZoom"

    const-string v3, "maxZoom"

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    if-eqz v4, :cond_15

    .line 47
    :try_start_8
    invoke-virtual {v4}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    float-to-double v12, v5

    invoke-interface {v1, v0, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 48
    invoke-virtual {v4}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-double v12, v0

    invoke-interface {v1, v3, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    move/from16 v0, v35

    goto :goto_11

    .line 49
    :cond_15
    invoke-interface {v1, v0, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    move/from16 v0, v35

    float-to-double v12, v0

    .line 50
    invoke-interface {v1, v3, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    :goto_11
    const-string v5, "neutralZoom"

    .line 51
    invoke-interface {v1, v5, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 52
    invoke-virtual/range {v33 .. v33}, Landroidx/camera/lifecycle/e;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v6, v5}, Landroidx/camera/core/t;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    const-string v6, "cameraSelector.filter(ca\u2026der.availableCameraInfos)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_16

    const/4 v6, 0x0

    .line 54
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/camera/core/r;

    invoke-static {v7}, Li0/w;->i(Landroidx/camera/core/r;)Ljava/util/List;

    move-result-object v6

    const-string v7, "getSupportedQualities(cameraInfos[0])"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v7, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v6, v12}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 57
    check-cast v12, Li0/v;

    const/4 v13, 0x0

    .line 58
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/camera/core/r;

    invoke-static {v14, v12}, Li0/w;->h(Landroidx/camera/core/r;Li0/v;)Landroid/util/Size;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 59
    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 60
    :cond_16
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v7

    .line 61
    :cond_17
    invoke-virtual/range {v29 .. v29}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputFormats()[I

    move-result-object v5

    move-object/from16 v6, v28

    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 63
    array-length v13, v5

    const/4 v14, 0x0

    :goto_13
    if-ge v14, v13, :cond_18

    aget v15, v5, v14

    move-object/from16 v10, v29

    .line 64
    invoke-virtual {v10, v15}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v11

    const-string v15, "cameraConfig.getOutputSizes(it)"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Lkotlin/collections/b;->u0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    .line 65
    invoke-static {v12, v11}, Lkotlin/collections/h;->y(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v29, v10

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    goto :goto_13

    :cond_18
    move-object/from16 v10, v29

    .line 66
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 67
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_19

    const/4 v11, 0x0

    goto :goto_15

    .line 68
    :cond_19
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 69
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-nez v12, :cond_1a

    goto :goto_15

    .line 70
    :cond_1a
    move-object v12, v11

    check-cast v12, Landroid/util/Size;

    .line 71
    invoke-virtual {v12}, Landroid/util/Size;->getWidth()I

    move-result v13

    invoke-virtual {v12}, Landroid/util/Size;->getHeight()I

    move-result v12

    mul-int/2addr v13, v12

    .line 72
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 73
    move-object v14, v12

    check-cast v14, Landroid/util/Size;

    .line 74
    invoke-virtual {v14}, Landroid/util/Size;->getWidth()I

    move-result v15

    invoke-virtual {v14}, Landroid/util/Size;->getHeight()I

    move-result v14

    mul-int/2addr v15, v14

    if-ge v13, v15, :cond_1b

    move-object v11, v12

    move v13, v15

    .line 75
    :cond_1b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-nez v12, :cond_2e

    .line 76
    :goto_15
    invoke-static {v11}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast v11, Landroid/util/Size;

    .line 77
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v5

    .line 78
    invoke-virtual {v10}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputFormats()[I

    move-result-object v12

    invoke-static {v12, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    array-length v13, v12

    const/4 v14, 0x0

    :goto_16
    if-ge v14, v13, :cond_2d

    aget v15, v12, v14

    move/from16 v35, v0

    .line 80
    invoke-static {v15}, Lre/a;->a(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v2

    .line 81
    invoke-virtual {v10, v15}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v2

    move-object/from16 v28, v6

    const-string v6, "cameraConfig.getOutputSizes(formatId)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    array-length v6, v2

    move-object/from16 v29, v12

    const/4 v12, 0x0

    :goto_17
    if-ge v12, v6, :cond_2c

    move/from16 v38, v6

    aget-object v6, v2, v12

    move-object/from16 v39, v2

    const-string v2, "size"

    .line 83
    invoke-static {v6, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v11}, Lre/c;->a(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    move/from16 v40, v13

    move/from16 v41, v14

    .line 84
    :try_start_9
    invoke-virtual {v10, v15, v6}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    move-result-wide v13

    long-to-double v13, v13

    const-wide v42, 0x41cdcd6500000000L    # 1.0E9

    div-double v13, v13, v42

    invoke-static {v13, v14}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    move-result-object v13
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    move-object/from16 v14, v27

    move-object/from16 v27, v10

    goto :goto_18

    .line 85
    :catchall_1
    :try_start_a
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Minimum Frame Duration for MediaRecorder Output cannot be calculated, format \""

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "\" is not supported."

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v14, v27

    invoke-static {v14, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object/from16 v27, v10

    const/4 v13, 0x0

    .line 86
    :goto_18
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v10
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    move-object/from16 v42, v11

    const-string v11, "maxFrameRate"

    move/from16 v43, v15

    const-string v15, "minFrameRate"

    if-eqz v13, :cond_1c

    .line 87
    :try_start_b
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v44

    const-wide/16 v46, 0x0

    cmpl-double v44, v44, v46

    if-lez v44, :cond_1c

    .line 88
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v44

    move-object/from16 v46, v14

    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    div-double v13, v36, v44

    double-to-int v13, v13

    .line 89
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v14

    move-object/from16 v44, v1

    const/4 v1, 0x1

    .line 90
    invoke-interface {v14, v15, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 91
    invoke-interface {v14, v11, v13}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 92
    invoke-interface {v10, v14}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_19

    :cond_1c
    move-object/from16 v44, v1

    move-object/from16 v46, v14

    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    :goto_19
    move-object/from16 v1, v22

    .line 93
    array-length v13, v1

    const/4 v14, 0x0

    :goto_1a
    if-ge v14, v13, :cond_1d

    aget-object v22, v1, v14

    move-object/from16 v45, v1

    .line 94
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    move/from16 v47, v13

    .line 95
    invoke-virtual/range {v22 .. v22}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v13

    move/from16 v48, v12

    const-string v12, "range.lower"

    invoke-static {v13, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v12

    invoke-interface {v1, v15, v12}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 96
    invoke-virtual/range {v22 .. v22}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v12

    const-string v13, "range.upper"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    invoke-interface {v1, v11, v12}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 97
    invoke-interface {v10, v1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, v45

    move/from16 v13, v47

    move/from16 v12, v48

    goto :goto_1a

    :cond_1d
    move-object/from16 v45, v1

    move/from16 v48, v12

    .line 98
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v1

    .line 99
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 100
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v11

    const-string v12, "off"

    .line 101
    invoke-interface {v11, v12}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    if-eqz v31, :cond_1e

    move-object/from16 v12, v31

    const/4 v13, 0x1

    .line 102
    invoke-static {v12, v13}, Lkotlin/collections/b;->w([II)Z

    move-result v14

    if-eqz v14, :cond_1f

    const-string v13, "auto"

    .line 103
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    const-string v13, "standard"

    .line 104
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    goto :goto_1b

    :cond_1e
    move-object/from16 v12, v31

    :cond_1f
    :goto_1b
    if-eqz v32, :cond_20

    move-object/from16 v15, v32

    const/4 v14, 0x1

    .line 105
    invoke-static {v15, v14}, Lkotlin/collections/b;->w([II)Z

    move-result v13

    if-eqz v13, :cond_21

    const-string v13, "cinematic"

    .line 106
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    goto :goto_1c

    :cond_20
    move-object/from16 v15, v32

    const/4 v14, 0x1

    :cond_21
    :goto_1c
    const-string v13, "420v"

    .line 107
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v14

    move-object/from16 v22, v0

    const-string v0, "photoHeight"

    move-object/from16 v31, v12

    .line 108
    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    move-result v12

    move-object/from16 v32, v13

    int-to-double v12, v12

    invoke-interface {v14, v0, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v0, "photoWidth"

    .line 109
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    move-result v12

    int-to-double v12, v12

    invoke-interface {v14, v0, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 110
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Landroid/util/Size;

    move-object/from16 v47, v0

    invoke-virtual {v13}, Landroid/util/Size;->getWidth()I

    move-result v0

    move-object/from16 v49, v7

    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    move-result v7

    if-gt v0, v7, :cond_22

    invoke-virtual {v13}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    move-result v7

    if-gt v0, v7, :cond_22

    const/4 v0, 0x1

    goto :goto_1e

    :cond_22
    const/4 v0, 0x0

    :goto_1e
    if-eqz v0, :cond_23

    goto :goto_1f

    :cond_23
    move-object/from16 v0, v47

    move-object/from16 v7, v49

    goto :goto_1d

    :cond_24
    move-object/from16 v49, v7

    const/4 v12, 0x0

    :goto_1f
    check-cast v12, Landroid/util/Size;

    const-string v0, "format"

    .line 111
    invoke-static {v14, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoHeight"

    if-eqz v12, :cond_25

    invoke-virtual {v12}, Landroid/util/Size;->getHeight()I

    move-result v6

    int-to-double v6, v6

    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    move-result-object v6

    goto :goto_20

    :cond_25
    const/4 v6, 0x0

    :goto_20
    invoke-static {v14, v0, v6}, Lse/p;->a(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Double;)V

    const-string v0, "videoWidth"

    if-eqz v12, :cond_26

    .line 112
    invoke-virtual {v12}, Landroid/util/Size;->getWidth()I

    move-result v6

    int-to-double v6, v6

    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    move-result-object v6

    goto :goto_21

    :cond_26
    const/4 v6, 0x0

    :goto_21
    invoke-static {v14, v0, v6}, Lse/p;->a(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Double;)V

    const-string v0, "isHighestPhotoQualitySupported"

    if-eqz v2, :cond_27

    const/4 v2, 0x1

    goto :goto_22

    :cond_27
    const/4 v2, 0x0

    .line 113
    :goto_22
    invoke-interface {v14, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "maxISO"

    if-eqz v30, :cond_28

    .line 114
    invoke-virtual/range {v30 .. v30}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    goto :goto_23

    :cond_28
    const/4 v2, 0x0

    :goto_23
    invoke-static {v14, v0, v2}, Lse/p;->b(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "minISO"

    if-eqz v30, :cond_29

    .line 115
    invoke-virtual/range {v30 .. v30}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    goto :goto_24

    :cond_29
    const/4 v2, 0x0

    :goto_24
    invoke-static {v14, v0, v2}, Lse/p;->b(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "fieldOfView"

    .line 116
    invoke-interface {v14, v0, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    if-eqz v4, :cond_2a

    .line 117
    invoke-virtual {v4}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_25

    :cond_2a
    move/from16 v0, v35

    :goto_25
    float-to-double v6, v0

    invoke-interface {v14, v3, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v0, "colorSpaces"

    .line 118
    invoke-interface {v14, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v0, "supportsVideoHDR"

    const/4 v1, 0x0

    .line 119
    invoke-interface {v14, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "supportsPhotoHDR"

    if-eqz v16, :cond_2b

    const/4 v2, 0x1

    goto :goto_26

    :cond_2b
    move v2, v1

    .line 120
    :goto_26
    invoke-interface {v14, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "frameRateRanges"

    .line 121
    invoke-interface {v14, v0, v10}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v0, "autoFocusSystem"

    const-string v2, "none"

    .line 122
    invoke-interface {v14, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "videoStabilizationModes"

    .line 123
    invoke-interface {v14, v0, v11}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v0, "pixelFormat"

    move-object/from16 v2, v32

    .line 124
    invoke-interface {v14, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    invoke-interface {v5, v14}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    add-int/lit8 v12, v48, 0x1

    move-object/from16 v32, v15

    move-object/from16 v0, v22

    move-object/from16 v10, v27

    move/from16 v6, v38

    move-object/from16 v2, v39

    move/from16 v13, v40

    move/from16 v14, v41

    move-object/from16 v11, v42

    move/from16 v15, v43

    move-object/from16 v1, v44

    move-object/from16 v22, v45

    move-object/from16 v27, v46

    move-object/from16 v7, v49

    goto/16 :goto_17

    :cond_2c
    move-object/from16 v44, v1

    move-object/from16 v49, v7

    move-object/from16 v42, v11

    move/from16 v40, v13

    move/from16 v41, v14

    move-object/from16 v45, v22

    move-object/from16 v46, v27

    move-object/from16 v15, v32

    const/4 v1, 0x0

    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    move-object/from16 v27, v10

    add-int/lit8 v14, v41, 0x1

    move-object/from16 v2, v17

    move-object/from16 v6, v28

    move-object/from16 v12, v29

    move/from16 v0, v35

    move-object/from16 v1, v44

    move-object/from16 v27, v46

    goto/16 :goto_16

    :cond_2d
    move-object/from16 v44, v1

    move-object/from16 v17, v2

    move-object/from16 v28, v6

    const/4 v1, 0x0

    const-string v0, "formats"

    move-object/from16 v2, v44

    .line 126
    invoke-interface {v2, v0, v5}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    move-object/from16 v0, v26

    .line 127
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    add-int/lit8 v13, v25, 0x1

    move-object/from16 v1, p0

    move-object v12, v0

    move-object/from16 v2, v17

    move-object/from16 v10, v18

    move-object/from16 v14, v19

    move/from16 v15, v20

    move-object/from16 v11, v21

    move-wide/from16 v3, v23

    move-object/from16 v0, v28

    move-object/from16 v5, v33

    move-object/from16 v9, v34

    const/4 v6, 0x3

    const/4 v7, 0x2

    goto/16 :goto_4

    :cond_2e
    move-object/from16 v17, v2

    move-object/from16 v46, v27

    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    move-object v2, v1

    move-object/from16 v2, v17

    goto/16 :goto_14

    :catchall_2
    move-exception v0

    move-object/from16 v21, v11

    goto :goto_27

    :cond_2f
    move-wide/from16 v23, v3

    move-object/from16 v46, v8

    move-object/from16 v21, v11

    move-object v0, v12

    .line 128
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long v1, v1, v23

    .line 129
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CameraViewModule::getAvailableCameraDevices took: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v46

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    move-object/from16 v11, v21

    .line 130
    :try_start_c
    invoke-interface {v11, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_29

    :catchall_3
    move-exception v0

    move-object/from16 v11, v21

    goto :goto_27

    .line 131
    :cond_30
    new-instance v0, Lcom/mrousavy/camera/b;

    invoke-direct {v0}, Lcom/mrousavy/camera/b;-><init>()V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :catchall_4
    move-exception v0

    .line 132
    :goto_27
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 133
    instance-of v1, v0, Lcom/mrousavy/camera/a;

    if-eqz v1, :cond_31

    check-cast v0, Lcom/mrousavy/camera/a;

    goto :goto_28

    :cond_31
    new-instance v1, Lcom/mrousavy/camera/j0;

    invoke-direct {v1, v0}, Lcom/mrousavy/camera/j0;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 134
    :goto_28
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/mrousavy/camera/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/mrousavy/camera/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v11, v1, v2, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    :goto_29
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method
