.class public Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Ld6/a;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/bridge/JavaModuleWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MethodDescriptor"
.end annotation


# instance fields
.field method:Ljava/lang/reflect/Method;
    .annotation build Ld6/a;
    .end annotation
.end field

.field name:Ljava/lang/String;
    .annotation build Ld6/a;
    .end annotation
.end field

.field signature:Ljava/lang/String;
    .annotation build Ld6/a;
    .end annotation
.end field

.field final synthetic this$0:Lcom/facebook/react/bridge/JavaModuleWrapper;

.field type:Ljava/lang/String;
    .annotation build Ld6/a;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/JavaModuleWrapper;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;->this$0:Lcom/facebook/react/bridge/JavaModuleWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
